package ua.lviv.iot.shoes_shop.shoes;

public class SportShoes extends Shoes {
    private String sportType;
    private boolean specEnhancements;

    public SportShoes(final int size, final String color, final Material material,
                      final int price, final Seasons season,
                      final Role role, final String brand,
                      final String importedSportType,
                      final boolean impSpEnhancements) {
        super(size, color, material, price, season, role, brand);
        this.sportType = importedSportType;
        this.specEnhancements = impSpEnhancements;
    }

    @Override
    public String toString() {
        return super.toString() + "sportType='" + sportType + '\''
                + ", specEnhancements=" + specEnhancements + '}';
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", Sport type, Special enhancements";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + sportType + ", " + specEnhancements;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(final String importedSportType) {
        this.sportType = importedSportType;
    }

    public boolean isSpecEnhancements() {
        return specEnhancements;
    }

    public void setSpecEnhancements(final boolean impSpEnhancements) {
        this.specEnhancements = impSpEnhancements;
    }
}
