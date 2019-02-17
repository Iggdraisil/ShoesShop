package ua.lviv.iot.ShoesShop.manager;


import ua.lviv.iot.ShoesShop.shoes.Role;

public class Main {

    public static void main(String[] args) {
        ShoesShopManager shoesShopManager = new ShoesShopManager();
        shoesShopManager.printListOfShoes(shoesShopManager.sortBySize(SortType.DESCENDING));
        System.out.println();
        shoesShopManager.printListOfShoes(shoesShopManager.filTerByRole(Role.SPORT));
    }
}
