package ua.lviv.iot.ShoesShop.test;

import ua.lviv.iot.ShoesShop.manager.ShoesShopManager;
import ua.lviv.iot.ShoesShop.manager.SortType;
import ua.lviv.iot.ShoesShop.shoes.*;

import java.util.ArrayList;
import java.util.List;
import  org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoesShopManagerTest {

    ArrayList<Shoes> setListForTesting(){
        ArrayList<Shoes> shoesList = new ArrayList<>();
        shoesList.add(new Shoes(42, "Blue", Material.LEATHER,
                5000, Seasons.SUMMER, Role.MEN, "LaCosta"));

        shoesList.add(new Shoes(46, "Black", Material.SHMIT, 500,
                Seasons.SUMMER, Role.WOMEN, "Abibas"));

        shoesList.add(new ChildsShoes(23, "White", Material.LEATHER,4000, Seasons.SUMMER,
                Role.CHILD, "Antoshka", true, true,ChildsAge.SEVEN_TO_TWELVE));

        shoesList.add(new ChildsShoes(12, "Rainbow", Material.RUBBER, 1000, Seasons.DEMISEASON,
                Role.CHILD, "Lolikon", false, true, ChildsAge.ZERO_TO_THREE));

        shoesList.add(new SportShoes(39, "Purple", Material.DERAMANTINE,3000, Seasons.DEMISEASON,
                Role.SPORT, "Nike", "Running", true));

        shoesList.add(new SportShoes(45, "Blue", Material.SHMIT,100, Seasons.SUMMER,
                Role.SPORT, "CoyoPC", "Walking", false));
        return shoesList;

    }

    @Test
    void sortByPriceTest() {
        ShoesShopManager shoesShopManager = new ShoesShopManager();
        shoesShopManager.setList(setListForTesting());
        shoesShopManager.sortByPrice(SortType.ASCENDING);
        for (int i = 0; i < shoesShopManager.getList().size() - 1;i++)
        if (shoesShopManager.getList().get(i).getPrice()>shoesShopManager.getList().get(i+1).getPrice()) {
            fail("Sort by price isn't working properly");
        }
    }

    @Test
    void sortBySizeTest() {
        ShoesShopManager shoesShopManager = new ShoesShopManager();
        shoesShopManager.setList(setListForTesting());
        shoesShopManager.sortBySize(SortType.ASCENDING);
        for (int i = 0; i < shoesShopManager.getList().size() - 1;i++)
            if (shoesShopManager.getList().get(i).getSize()>shoesShopManager.getList().get(i+1).getSize()) {
                fail("Sort by price isn't working properly");
            }
    }

    @Test
    void filterByRoleTest() {
        ShoesShopManager shoesShopManager = new ShoesShopManager();
        shoesShopManager.setList(setListForTesting());
        assertEquals(2,shoesShopManager.filterByRole(Role.SPORT).size());

    }

    @Test
    void filterBySizeTest() {
        ShoesShopManager shoesShopManager = new ShoesShopManager();
        shoesShopManager.setList(setListForTesting());
        assertEquals(1,shoesShopManager.filterBySize(42).size());

    }

    @Test
    void getListTest() {
        ShoesShopManager shoesShopManager = new ShoesShopManager();
        shoesShopManager.setList(setListForTesting());
        for (Shoes shoes: shoesShopManager.getList()) {
            shoes.toString();
        }
        assertEquals(6,shoesShopManager.getList().size());
    }

    @Test
    void setListTest() {
        ShoesShopManager shoesShopManager = new ShoesShopManager();
        shoesShopManager.setList(setListForTesting());
        assertEquals(6,shoesShopManager.getList().size());
    }
}