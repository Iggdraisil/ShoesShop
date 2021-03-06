package ua.lviv.iot.shoes_shop.manager;

import ua.lviv.iot.shoes_shop.shoes.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class ShoesShopManager {
    ArrayList<Shoes> list = new ArrayList<>();

    public void printListOfShoes(ArrayList<Shoes> list){
        for (int i=0; i<list.size(); i++)
            System.out.println(list.get(i).toString());
    }

    public ArrayList<Shoes> sortByPrice(SortType sortType){
        Collections.sort(list, (p1,p2) -> Double.compare(p1.getPrice(),p2.getPrice()));
        if(sortType== SortType.DESCENDING)
            Collections.reverse(list);
        return list;
    }

    public ArrayList<Shoes> sortBySize(SortType sortType){
        list.sort((p1,p2) -> Integer.compare(p1.getSize(),p2.getSize()));
        if(sortType== SortType.DESCENDING)
            Collections.reverse(list);
        return list;
    }

    public ArrayList<Shoes> filterByRole(Role role){
        ArrayList<Shoes> filteredShoesList = list.stream().filter(shoes -> shoes.getRole() == role).collect(Collectors
                .toCollection(ArrayList::new));
        return filteredShoesList;

    }
    public ArrayList<Shoes> filterBySize(int size){
        ArrayList<Shoes> filteredShoesList = list.stream().filter(shoes -> shoes.getSize() == size).collect(Collectors
                .toCollection(ArrayList::new));
            return filteredShoesList;
    }
    ShoesShopManager(){
    }

    public ArrayList<Shoes> getList() {
        return list;
    }

    public void setList(ArrayList<Shoes> list) {
        this.list = list;
    }
}
