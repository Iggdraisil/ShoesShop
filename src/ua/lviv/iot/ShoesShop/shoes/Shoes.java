package ua.lviv.iot.ShoesShop.shoes;


public class Shoes {
    private int size;
    private String color;
    private Material material;
    private int price;
    private Seasons season;
    private Role role;
    private String brand;

    public Shoes(int size, String color, Material material, int price, Seasons season, Role role, String brand) {
        this.size = size;
        this.color = color;
        this.material = material;
        this.price = price;
        this.season = season;
        this.role = role;
        this.brand = brand;
    }

    public Shoes() {
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", material=" + material +
                ", price=" + price +
                ", season=" + season +
                ", role=" + role +
                ", brand='" + brand + '\'' +
                '}';
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Seasons getSeason() {
        return season;
    }

    public void setSeason(Seasons season) {
        this.season = season;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
