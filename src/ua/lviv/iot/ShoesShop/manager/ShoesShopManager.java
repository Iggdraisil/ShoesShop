package ua.lviv.iot.ShoesShop.manager;

import ua.lviv.iot.ShoesShop.shoes.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class ShoesShopManager {
    ArrayList<Shoes> list = new ArrayList<>();

    public void printListOfShoes(ArrayList<Shoes> list){
        for (int i=0;i<list.size();i++)
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

    public ArrayList<Shoes> filTerByRole(Role role){
        ArrayList<Shoes> filteredShoesList = list.stream().filter(shoes -> shoes.getRole()==role).collect(Collectors
                .toCollection(ArrayList::new));
        return filteredShoesList;

    }
    public ArrayList<Shoes> filterBySize(int size){
        ArrayList<Shoes> filteredShoesList = list.stream().filter(shoes -> shoes.getSize()==size).collect(Collectors
                .toCollection(ArrayList::new));
        for (int i=0;i<filteredShoesList.size();i++) {
            System.out.println(filteredShoesList.get(i).toString());
        }
            return filteredShoesList;
    }
    ShoesShopManager(){
        list.add(new Shoes(42,"Blue", Material.LEATHER,5000, Seasons.SUMMER,Role.MEN,"LaCosta"));
        list.add(new Shoes(46,"Black",Material.SHMIT,500,Seasons.SUMMER,Role.WOMEN,"Abibas"));
        list.add(new ChildsShoes(23,"White",Material.LEATHER,4000,Seasons.SUMMER,
                Role.CHILD,"Antoshka", true, true,ChildsAge.SEVEN_TO_TWELVE));
        list.add(new ChildsShoes(12,"Rainbow",Material.RUBBER,1000,Seasons.DEMISEASON,
                Role.CHILD,"Lolikon",false, true,ChildsAge.ZERO_TO_THREE));
        list.add(new SportShoes(39, "Purple",Material.DERAMANTINE,3000,Seasons.DEMISEASON,
                Role.SPORT, "Nike", "Running", true));
        list.add(new SportShoes(45,"Blue",Material.SHMIT,100,Seasons.SUMMER,
                Role.SPORT,"CoyoPC","Walking",false));


    }




}
