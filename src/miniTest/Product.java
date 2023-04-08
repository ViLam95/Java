package miniTest;

import java.util.Scanner;

public class Product {
   private int id;
    private String name;
    private double price;
    private String type;
    static String money = "USD";

    public Product(int id, String name, double price, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getMoney() {
        return money;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void setMoney(String money) {
        Product.money = money;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", usd='" + money + '\'' +
                '}';
    }
    static Scanner scanner = new Scanner(System.in);
    public static Product getProduct(){
        System.out.println("Enter product id: ");
        int id = scanner.nextInt();
        System.out.println("Enter name of product: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter price: ");
        double price = scanner.nextDouble();
        System.out.println("Enter product type: ");
        String type = scanner.nextLine();
        scanner.nextLine();
        return new Product(id,name,price,type);
    }
}
