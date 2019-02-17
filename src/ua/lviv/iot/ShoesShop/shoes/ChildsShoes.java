package ua.lviv.iot.ShoesShop.shoes;

public class ChildsShoes extends Shoes {
    private boolean anatomicLast;
    private boolean supinator;
    private ChildsAge childsAge;

    @Override
    public String toString() {
        return super.toString()+
                "anatomicLast=" + anatomicLast +
                ", supinator=" + supinator +
                ", childsAge=" + childsAge +
                '}';
    }

    public ChildsShoes(int size, String color, Material material, int price, Seasons season, Role role, String brand, boolean anatomicLast, boolean supinator, ChildsAge childsAge) {
        super(size, color, material, price, season, role, brand);
        this.anatomicLast = anatomicLast;
        this.supinator = supinator;
        this.childsAge = childsAge;
    }

}
