package ua.lviv.iot.shoes_shop.shoes;

public class SportShoes extends Shoes {
    private String sportType;
    private boolean specialEnhancements;

    public SportShoes(int size, String color, Material material, int price, Seasons season, Role role, String brand, String sportType, boolean specialEnhancements) {
        super(size, color, material, price, season, role, brand);
        this.sportType = sportType;
        this.specialEnhancements = specialEnhancements;
    }

    @Override
    public String toString() {
        return super.toString()+
                "sportType='" + sportType + '\'' +
                ", specialEnhancements=" + specialEnhancements +
                '}';
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public boolean isSpecialEnhancements() {
        return specialEnhancements;
    }

    public void setSpecialEnhancements(boolean specialEnhancements) {
        this.specialEnhancements = specialEnhancements;
    }
}
