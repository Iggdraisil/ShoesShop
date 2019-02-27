package ua.lviv.iot.ShoesShop.shoes;

public class SportShoes extends Shoes {
    private String sportType;
    private boolean specialEnhancements;

    public SportShoes(final int size, final String color, final Material material,
                      final int price, final Seasons season,
                      final Role role, final String brand,
                      final String importedSportType,
                      final boolean importedSpecialEnhancements) {
        super(size, color, material, price, season, role, brand);
        this.sportType = importedSportType;
        this.specialEnhancements = importedSpecialEnhancements;
    }

    @Override
    public String toString() {
        return super.toString()+ "sportType='" + sportType + '\''
                + ", specialEnhancements=" + specialEnhancements + '}';
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(final String importedSportType) {
        this.sportType = importedSportType;
    }

    public boolean isSpecialEnhancements() {
        return specialEnhancements;
    }

    public void setSpecialEnhancements(final boolean importedSpecialEnhancements) {
        this.specialEnhancements = importedSpecialEnhancements;
    }
}
