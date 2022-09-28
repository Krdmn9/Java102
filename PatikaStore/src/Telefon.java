public class Telefon extends Product {
    private String name;
    private int id;
    private int price;
    private Brand brand;
    private int ram;
    private double ekran;
    private int cam;
    private int SSD;
    private int battery;
    private String color;

    public Telefon(int id, String name, int price, Brand brand, int SSD, double ekran, int cam, int battery, int ram, String color) {
        super("Telefon");
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.SSD = SSD;
        this.ekran = ekran;
        this.cam = cam;
        this.battery = battery;
        this.ram = ram;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public Brand getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public double getEkran() {
        return ekran;
    }

    public int getCam() {
        return cam;
    }

    public int getSSD() {
        return SSD;
    }

    public int getBattery() {
        return battery;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setEkran(double ekran) {
        this.ekran = ekran;
    }

    public void setCam(int cam) {
        this.cam = cam;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

