package miniTest;

import java.util.Scanner;

public class CheckProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product quantity: ");
        int size = scanner.nextInt();//Nhập vào n số lượng sản phẩm;
        Product[] products = new Product[size];//tạo danh sách n sản phẩm;
        for (int i = 0; i < products.length; i++) {
            products[i] = Product.getProduct();
        }
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
        search(products);
        System.out.println("Tổng tất cả các giá tiền là :" + totalamountOfProducts(products));
        Advance.delete(products);
        Advance.edit(products);

    }
    //Tìm sản phẩm
    public static void search(Product[] products){
        Scanner sc = new Scanner(System.in);
        System.out.println("Find a product by name: ");
        String name = sc.nextLine();
        boolean check = true;
        for (int j = 0; j < products.length; j++) {
            Product product = products[j];
            int i = 0;
            if (name.equals(products[i].getName())) {
                check = false;
                System.out.println(product);
            }
            if (!check) {
                System.out.println("We don't have the product you're looking for: ");
            }
        }
    }
    //Tính tổng tiền các sản phẩm.
    public static int totalamountOfProducts(Product[]products){
        int sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].getPrice();
        } return sum;
    }
}


