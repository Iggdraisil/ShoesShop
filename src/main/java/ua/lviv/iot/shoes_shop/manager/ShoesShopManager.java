package ua.lviv.iot.shoes_shop.manager;

import ua.lviv.iot.shoes_shop.shoes.Shoes;
import ua.lviv.iot.shoes_shop.shoes.Role;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ShoesShopManager {
    private List<Shoes> list = new ArrayList<>();

    public ShoesShopManager(final List<Shoes> impList) {
        this.list = impList;
    }

    public final void printListOfShoes(final List<Shoes> listToPrint) {
        for (final Shoes shoes : listToPrint) {
            System.out.println(shoes.toString());
        }
    }

    public final List<Shoes> sortByPrice(final SortType sortType) {
        list.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        if (sortType == SortType.DESCENDING) {
            Collections.reverse(list);
        }
        return list;
    }

    public final List<Shoes> sortBySize(final SortType sortType) {
        list.sort((p1, p2) -> Integer.compare(p1.getSize(), p2.getSize()));
        if (sortType == SortType.DESCENDING) {
            Collections.reverse(list);
        }
        return list;
    }

    public final List<Shoes> filterByRole(final Role role) {
        return list.stream().filter(shoes -> shoes.getRole() == role)
                .collect(Collectors.toCollection(ArrayList::new));

    }

    public final List<Shoes> filterBySize(final int size) {
        return list.stream().filter(shoes -> shoes.getSize() == size)
                    .collect(Collectors.toCollection(ArrayList::new));
    }

    public final List<Shoes> getList() {
        return list;
    }

    public final void setList(final List<Shoes> inputList) {
        this.list = inputList;
    }
}
