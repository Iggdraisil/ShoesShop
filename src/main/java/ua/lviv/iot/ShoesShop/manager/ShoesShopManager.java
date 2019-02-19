package ua.lviv.iot.ShoesShop.manager;

import ua.lviv.iot.ShoesShop.shoes.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ShoesShopManager {
    private ArrayList<Shoes> list = new ArrayList<>();

    ShoesShopManager() {
    }

    public void printListOfShoes(final ArrayList<Shoes> listToPrint) {
        for (int i = 0; i < listToPrint.size(); i++) {
            System.out.println(listToPrint.get(i).toString());
        }
    }

    public ArrayList<Shoes> sortByPrice(final SortType sortType) {
        Collections.sort(list, (p1, p2) -> Double
                .compare(p1.getPrice(), p2.getPrice()));
        if (sortType == SortType.DESCENDING) {
            Collections.reverse(list);
        }
        return list;
    }

    public ArrayList<Shoes> sortBySize(final SortType sortType) {
        list.sort((p1, p2) -> Integer.compare(p1.getSize(), p2.getSize()));
        if (sortType == SortType.DESCENDING) {
            Collections.reverse(list);
        }
        return list;
    }

    public ArrayList<Shoes> filterByRole(final Role role) {
        ArrayList<Shoes> filteredShoesList = list.stream()
                .filter(shoes -> shoes.getRole() == role).collect(Collectors
                    .toCollection(ArrayList::new));
        return filteredShoesList;

    }

    public ArrayList<Shoes> filterBySize(final int size) {
        ArrayList<Shoes> filteredShoesList = list.stream()
                .filter(shoes -> shoes.getSize() == size)
                    .collect(Collectors.toCollection(ArrayList::new));
        for (int i = 0; i < filteredShoesList.size(); i++) {
            System.out.println(filteredShoesList.get(i).toString());
        }
        return filteredShoesList;
    }

    public ArrayList<Shoes> getList() {
        return list;
    }

    public void setList(final ArrayList<Shoes> iputList) {
        this.list = iputList;
    }
}
