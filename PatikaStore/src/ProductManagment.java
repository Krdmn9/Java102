import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManagment {

    private ArrayList<Brand> brands = new ArrayList<>();
    private ArrayList<String> products = new ArrayList<>();
    private ArrayList<Notebook> notebooks = new ArrayList<>();
    private ArrayList<Telefon> phones = new ArrayList<>();

    public void run() {
        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        this.brands = createBrandList();
        this.products = createProductList();
        this.notebooks = createNotebookList();
        this.phones = createPhoneList();
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while(choice != 0) {
            this.printMenu();
            choice = input.nextInt();
            if(choice == 0) {
                System.out.println("İyi günler dileriz");
                break;
            }
            else if (choice == 3) {
                this.printBrandList();
            }
            else if(choice == 2) {
                System.out.println("Telefon eklemek için (1)");
                System.out.println("Telefon silmek için (2)");
                System.out.println("Telefonları listelemek için (3)");
                int select = input.nextInt();
                if(select == 1) {
                    System.out.print("ID giriniz: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("Ürün adı giriniz: ");
                    String name = input.nextLine();
                    System.out.print("Fiyat giriniz: ");
                    int price = input.nextInt();
                    input.nextLine();
                    System.out.print("Marka giriniz: ");
                    String brandName = input.nextLine();
                    Brand brand = new Brand(brandName);
                    System.out.print("Depolama alanı giriniz: ");
                    int ssd = input.nextInt();
                    input.nextLine();
                    System.out.print("Ekran boyutu giriniz: ");
                    double ekran = input.nextDouble();
                    input.nextLine();
                    System.out.print("Kamera çözünürlüğü giriniz: ");
                    int cam = input.nextInt();
                    input.nextLine();
                    System.out.print("Batarya kapasitesi giriniz: ");
                    int battery = input.nextInt();
                    input.nextLine();
                    System.out.print("RAM giriniz: ");
                    int ram = input.nextInt();
                    input.nextLine();
                    System.out.print("Renk giriniz: ");
                    String color = input.nextLine();
                    this.addPhone(new Telefon(id,name,price,brand,ssd,ekran,cam,battery,ram,color));
                }
                else if(select == 2) {
                    printPhoneList();
                    System.out.print("ID giriniz: ");
                    int select2 = input.nextInt();
                    boolean isSuccess = false;
                    for (int i = 0; i < this.phones.size(); i++) {
                        if (this.phones.get(i).getId() == select2) {
                            this.phones.remove(phones.get(i));
                            isSuccess = true;
                        }
                    }
                    if(isSuccess) {
                        System.out.println("İşlem başarılı!");
                    }
                    else {
                        System.out.println("Aradığınız ID'de ürün bulunamamaktadır!");
                    }
                }
                else if(select == 3) {
                    printPhoneList();
                }
                else {
                    System.out.println("Geçersiz giriş!");
                }

            }
            else if (choice == 1) {
                System.out.println("Notebook eklemek için (1)");
                System.out.println("Notebook silmek için (2)");
                System.out.println("Notebook listelemek için (3)");
                int select = input.nextInt();
                if(select == 1) {
                    System.out.print("ID giriniz: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("Ürün adı giriniz: ");
                    String name = input.nextLine();

                    System.out.print("Fiyat giriniz: ");
                    int price = input.nextInt();
                    input.nextLine();
                    System.out.print("Marka giriniz: ");
                    String brandName = input.nextLine();

                    Brand brand = new Brand(brandName);
                    System.out.print("Depolama alanı giriniz: ");
                    int ssd = input.nextInt();
                    input.nextLine();
                    System.out.print("Ekran boyutu giriniz: ");
                    double ekran = input.nextDouble();
                    input.nextLine();
                    System.out.print("RAM giriniz: ");
                    int ram = input.nextInt();
                    input.nextLine();
                    this.addNotebook(new Notebook(id,name,price,brand,ssd,ekran,ram));
                }
                else if(select == 2) {
                    printNotebookList();
                    System.out.print("ID giriniz: ");
                    int select2 = input.nextInt();
                    boolean isSuccess = false;
                    for (int i = 0; i < this.notebooks.size(); i++) {
                        if (this.notebooks.get(i).getId() == select2) {
                            this.notebooks.remove(notebooks.get(i));
                            isSuccess = true;
                        }
                    }
                    if(isSuccess) {
                        System.out.println("İşlem başarılı!");
                    }
                    else {
                        System.out.println("Aradığınız ID'de ürün bulunamamaktadır!");
                    }
                }
                else if (select == 3) {
                    printNotebookList();
                }
                else {
                    System.out.println("Geçersiz giriş!");
                }

            }
        }
    }

    public void addNotebook(Notebook notebook) {
        this.notebooks.add(notebook);

    }
    public void addPhone(Telefon phone) {
        this.phones.add(phone);
    }

    public void printMenu() {
        System.out.println("1- Notebook İşlemleri");
        System.out.println("2- Cep Telefonu İşlemleri");
        System.out.println("3- Marka Listele");
        System.out.println("0- Çıkış Yap");
    }
    public ArrayList<Brand> createBrandList() {
        this.brands.add(new Brand("Samsung"));
        this.brands.add(new Brand("Lenovo"));
        this.brands.add(new Brand("Apple"));
        this.brands.add(new Brand("Huawei"));
        this.brands.add(new Brand("Casper"));
        this.brands.add(new Brand("Asus"));
        this.brands.add(new Brand("HP"));
        this.brands.add(new Brand("Xiaomi"));
        this.brands.add(new Brand("Monster"));
        Collections.sort(this.brands);
        return this.brands;
    }

    public void printBrandList() {
        System.out.println("----MARKALAR----");
        for(Brand br: this.brands) {
            System.out.println(br.getName());
        }
        System.out.println("----------------");
    }
    public ArrayList<String> createProductList() {
        this.products.add("Samsung");
        this.products.add("Lenovo");
        return this.products;
    }

    public void printProductList() {
        System.out.println("----ÜRÜNLER----");
        for(String productName : this.products) {
            System.out.println(productName);
        }
        System.out.println("---------------");
    }

    public ArrayList<Telefon> createPhoneList() {
        this.phones.add(new Telefon(1,"Samsung Galaxy A51", 3199, new Brand("Samsung"), 128, 6.5, 32, 4000, 6, "Siyah"));
        this.phones.add(new Telefon(2,"iPhone 11 64 GB", 7379, new Brand("Apple"), 64, 6.1, 5, 3046, 6, "Mavi"));
        this.phones.add(new Telefon(3,"Redmi Note 10 Pro 8 GB", 4012, new Brand("Xiaomi"), 128, 6.5, 35, 4000, 12, "Beyaz"));
        return this.phones;
    }

    public void printPhoneList() {
        System.out.println("-------------------------TELEFONLAR-----------------------------");
        for(Telefon tf : this.phones) {
            System.out.println(tf.getId() + "\t" +  tf.getName() + "\t" + tf.getPrice() + "\t" + tf.getBrand().getName() + "\t" + tf.getSSD() + "\t" + tf.getEkran() + "\t" + tf.getCam() + "\t" + tf.getBattery() + "\t" + tf.getRam() + "\t" + tf.getColor());
        }
        System.out.println("-----------------------------------------------------------------");
    }

    public ArrayList<Notebook> createNotebookList() {
        this.notebooks.add(new Notebook(1,"Huawei Matebook 14", 7000, new Brand("Huawei"), 512, 14.0, 16));
        this.notebooks.add(new Notebook(2,"Lenovo V14 IGL", 3699, new Brand("Lenovo"), 1024, 14.0, 8));
        this.notebooks.add(new Notebook(3,"Asus Tuf Gaming", 8199, new Brand("Asus"), 2048, 15.6, 32));
        return this.notebooks;
    }

    public void printNotebookList() {
        System.out.println("-------------------------NOTEBOOK-----------------------------");
        for(Notebook nb : this.notebooks) {
            System.out.println(nb.getId() + "\t" +  nb.getName() + "\t" + nb.getPrice() + "\t" + nb.getBrand().getName() + "\t" + nb.getSSD() + "\t" + nb.getEkran() + "\t" + nb.getRam());
        }
        System.out.println("-----------------------------------------------------------------");
    }



}
