package ua.lviv.iot.shoes_shop.shoes;

public class ChildsShoes extends Shoes {
    private boolean anatomicLast;
    private boolean supinator;
    private ChildsAge childsAge;

    public String toString() {
        return super.toString() + "anatomicLast=" + anatomicLast
                + ", supinator=" + supinator + ", childsAge="
                + childsAge + '}';
    }

    public ChildsShoes(final int size, final String color,
                       final Material material,
                       final int price, final Seasons season,
                       final Role role, final String brand,
                       final boolean impAnatomicLast,
                       final boolean importedSupinator,
                       final ChildsAge importedChildsAge) {
        super(size, color, material, price, season, role, brand);
        this.anatomicLast = impAnatomicLast;
        this.supinator = importedSupinator;
        this.childsAge = importedChildsAge;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", Anatomic last, Supinator, Childs age";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + anatomicLast + ", "
                + supinator + ", " + childsAge;
    }

    public boolean isAnatomicLast() {
        return anatomicLast;
    }

    public void setAnatomicLast(final boolean impAnatomicLast) {
        this.anatomicLast = impAnatomicLast;
    }

    public boolean isSupinator() {
        return supinator;
    }

    public void setSupinator(final boolean importedSupinator) {
        this.supinator = importedSupinator;
    }

    public ChildsAge getChildsAge() {
        return childsAge;
    }

    public void setChildsAge(final ChildsAge importedChildsAge) {
        this.childsAge = importedChildsAge;
    }
}
