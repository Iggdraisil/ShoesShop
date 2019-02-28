package ua.lviv.iot.shoes_shop.shoes;

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

    public boolean isAnatomicLast() {
        return anatomicLast;
    }

    public void setAnatomicLast(boolean anatomicLast) {
        this.anatomicLast = anatomicLast;
    }

    public boolean isSupinator() {
        return supinator;
    }

    public void setSupinator(boolean supinator) {
        this.supinator = supinator;
    }

    public ChildsAge getChildsAge() {
        return childsAge;
    }

    public void setChildsAge(ChildsAge childsAge) {
        this.childsAge = childsAge;
    }
}
