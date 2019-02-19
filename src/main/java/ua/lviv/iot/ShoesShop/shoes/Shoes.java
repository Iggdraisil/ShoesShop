package ua.lviv.iot.ShoesShop.shoes;


public class Shoes {
    private int size;
    private String color;
    private Material material;
    private int price;
    private Seasons season;
    private Role role;
    private String brand;

    public Shoes(final int importedSize, final String importedColor,
                 final Material importedMaterial, final int importedPrice,
                 final Seasons importedSeason, final Role importedRole, final String importedBrand) {
        this.size = importedSize;
        this.color = importedColor;
        this.material = importedMaterial;
        this.price = importedPrice;
        this.season = importedSeason;
        this.role = importedRole;
        this.brand = importedBrand;
    }

    public Shoes() {
    }

    public String toString() {
        return "Shoes{" + "size=" + size + ", color='"
                + color + '\'' + ", material="
                + material + ", price=" + price
                + ", season=" + season
                + ", role=" + role + ", brand='" + brand + '\'' + '}';
    }

    public int getSize() {
        return size;
    }

    public void setSize(final int importedSize) {
        this.size = importedSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String importedColor) {
        this.color = importedColor;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(final Material importedMaterial) {
        this.material = importedMaterial;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int importedPrice) {
        this.price = importedPrice;
    }

    public Seasons getSeason() {
        return season;
    }

    public void setSeason(final Seasons importedSeason) {
        this.season = importedSeason;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(final Role importedRole) {
        this.role = importedRole;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String importedBrand) {
        this.brand = importedBrand;
    }
}
