package collection_framework.product;

import collection_framework.product.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager extends Product {
    private final ArrayList<Product> products;
    public static Scanner scanner = new Scanner(System.in);

    public ProductManager(){
        products = new ArrayList<>();
    }
    public void addProduct(){
        System.out.println("Nhâp tên của sản phẩm:");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm:");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Mô tả sản phẩm:");
        String description = scanner.nextLine();

        Product product = new Product(name,price,description);
        products.add(product);
        System.out.println("Đã thêm thành công!");
    }

    public void updateProduct(){
        System.out.println("Nhập id cần sửa:");
        int id = scanner.nextInt();

        for (Product product: products) {
            if (product.getId() == id){
                System.out.println("Nhap ten moi:");
                String name = scanner.nextLine();
                System.out.println("Nhap gia san pham moi:");
                double price = scanner.nextDouble();
                System.out.println("Mo ta san pham:");
                String description = scanner.nextLine();

                product.setName(name);
                product.setPrice(price);
                product.setDescription(description);
                System.out.println("Da cap nhat thanh cong");
                return;
            }
            else {
                System.out.println("Khong tim thay san pham");
            }
        }
    }
    public void removeProduct(){
        System.out.println("Nhap id can xoa:");
        int id = scanner.nextInt();

        for (Product product: products) {
            if (product.getId() == id){
                products.remove(product);
                System.out.println("Da xoa thanh cong");
                return;
            }
            else{
                System.out.println("Khong tim thay san pham");
            }
        }
    }
    public void displayProduct(){
        System.out.println("Danh sach san pham:");
        for (Product product: products) {
            System.out.println(product);
        }
    }
    public void searchProduct(){
        System.out.println("Nhap ten san pham:");
        String name = scanner.nextLine();

        for (Product product: products) {
            if (product.getName().equals(name)){
                System.out.println(product);
                return;
            }
            else{
                System.out.println("Khong tim thay san pham");
            }
        }
    }
    public void sortProductPriceAscending(){
        Collections.sort(products);
    }
    public void sortProductPriceDescending() {
        products.sort((o1, o2) -> (int) (o2.getPrice() - o1.getPrice()));
    }
}
