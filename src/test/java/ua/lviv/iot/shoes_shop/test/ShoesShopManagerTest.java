package ua.lviv.iot.shoes_shop.test;

import org.junit.jupiter.api.BeforeAll;
import ua.lviv.iot.shoes_shop.manager.ShoesShopManager;
import ua.lviv.iot.shoes_shop.manager.ShoesWriter;
import ua.lviv.iot.shoes_shop.manager.SortType;
import ua.lviv.iot.shoes_shop.shoes.Shoes;
import ua.lviv.iot.shoes_shop.shoes.Seasons;
import ua.lviv.iot.shoes_shop.shoes.Material;
import ua.lviv.iot.shoes_shop.shoes.Role;
import ua.lviv.iot.shoes_shop.shoes.ChildsShoes;
import ua.lviv.iot.shoes_shop.shoes.ChildsAge;
import ua.lviv.iot.shoes_shop.shoes.SportShoes;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import  org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class ShoesShopManagerTest {

    private final List<Shoes> shoesList = new ArrayList<>();

    @BeforeAll @Test
    public final void setListForTesting(){
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

    }

    @Test
    public final void sortByPriceTest() {
        final ShoesShopManager shoesShopManager = new ShoesShopManager(shoesList);
        shoesShopManager.sortByPrice(SortType.ASCENDING);
        for (int i = 0; i < shoesShopManager.getList().size() - 1;i++) {
            if (shoesShopManager.getList().get(i).getPrice() > shoesShopManager.getList().get(i + 1).getPrice()) {
                fail("Sort by price isn't working properly");
            }
        }
    }

    @Test
    public final void sortBySizeTset() {
        final ShoesShopManager shoesShopManager = new ShoesShopManager(shoesList);
        shoesShopManager.sortBySize(SortType.ASCENDING);
        for (int i = 0; i < shoesShopManager.getList().size() - 1;i++) {
            if (shoesShopManager.getList().get(i).getSize() > shoesShopManager.getList().get(i + 1).getSize()) {
                fail("Sort by price isn't working properly");
            }
        }
    }

    @Test
    public final void filterByRoleTest() {
        final ShoesShopManager shoesShopManager = new ShoesShopManager(shoesList);
        assertEquals(2,shoesShopManager.filterByRole(Role.SPORT).size()
                ,"Error filtering by role");

    }

    @Test
    public final void filterBySizeTest() {
        final ShoesShopManager shoesShopManager = new ShoesShopManager(shoesList);
        assertEquals(1,shoesShopManager.filterBySize(42).size()
                ,"Error filtering by size");

    }

    @Test
    public final void writeToFileTest(){
        try {
            ShoesWriter.writeToFile(shoesList);
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

    public List<Shoes> getShoesList() {
        return shoesList;
    }
}