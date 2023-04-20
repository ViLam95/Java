package collection_framework.product;

public class Product implements Comparable<Product> {
    private int id;
    private static int autoId = 1;
    private String name;
    private double price;
    private String description;

    public Product() {
    }

    public Product(String name, double price, String description) {
        this.id = autoId++;
        this.name = name;
        this.price = price;
        this.description = description;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if (o.getPrice() > this.getPrice()){
            return -1;
        }else if (o.getPrice() == this.getPrice()){
            return 0;
        }
        return 1;
    }
}
