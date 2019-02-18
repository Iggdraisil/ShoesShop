package ua.lviv.iot.ShoesShop.manager;


import ua.lviv.iot.ShoesShop.shoes.*;

import java.util.ArrayList;

public class MainTest {

    public static void main(final String[] args) {
        ShoesShopManager shoesShopManager = new ShoesShopManager();
        ArrayList<Shoes> list = new ArrayList<>();
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
        shoesShopManager.setList(list);
        shoesShopManager.printListOfShoes(shoesShopManager.sortBySize(SortType.DESCENDING));
        shoesShopManager.printListOfShoes(shoesShopManager.sortByPrice(SortType.ASCENDING));
        shoesShopManager.printListOfShoes(shoesShopManager.filterBySize(42));
        shoesShopManager.printListOfShoes(shoesShopManager.filterByRole(Role.SPORT));
    }
}
