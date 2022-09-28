public class Notebook extends Product{
    private int id;
    private String name;
    private int price;
    private Brand brand;
    private int SSD;
    private double ekran;
    private int ram;
    public Notebook(int id, String name, int price, Brand brand, int SSD, double ekran, int ram) {
        super("Notebook");
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.SSD = SSD;
        this.ekran = ekran;
        this.ram = ram;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public double getEkran() {
        return ekran;
    }

    public void setEkran(int ekran) {
        this.ekran = ekran;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
