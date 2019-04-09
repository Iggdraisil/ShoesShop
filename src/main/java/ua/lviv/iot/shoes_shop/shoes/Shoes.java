package ua.lviv.iot.shoes_shop.shoes;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shoes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int size;
    private String color;
    private Material material;
    private int price;
    private Seasons season;
    private Role role;
    private String brand;

    public Shoes(final int importedSize, final String importedColor,
                 final Material importedMaterial, final int importedPrice,
                 final Seasons importedSeason, final Role importedRole,
                 final String importedBrand) {
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

    public Shoes(Shoes shoe, int id) {
        this.setBrand(shoe.getBrand());
        this.setColor(shoe.getColor());
        this.setMaterial(shoe.getMaterial());
        this.setPrice(shoe.getPrice());
        this.setRole(shoe.getRole());
        this.setSeason(shoe.getSeason());
        this.setSize(shoe.getSize());
        this.setId(id);
    }

    public String toString() {
        return "Shoes{" + "size=" + size + ", color='"
                + color + '\'' + ", material="
                + material + ", price=" + price
                + ", season=" + season
                + ", role=" + role + ", brand='" + brand + '\'' + '}';
    }

    public String getHeaders() {
        return "Size, Color, Material, Price, Season, Role, Brand";
    }

    public String toCSV() {
        return size + ", " + color + ", " + material + ", "
                + price + ", " + season + ", " + role + ", " + brand;
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

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }
}
