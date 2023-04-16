//package demo.baiTapCuaNam;
//
//import java.util.Scanner;
//
//public class MainProduct {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Product[]products1 = new Product[3];
//        for (int i = 0; i < products1.length; i++) {
//            products1[i] = creatProduct(scanner );
//        }
//        for (Product p : products1){
//            System.out.println(p);
//        }
//
//    }
//    public static void findBrandById(Brand[] brands, int id){
//        for (Brand brand:brands){
//            if(brand.getId() == id){
//
//            }
//        }
//    }
//    public static Product creatProduct(Scanner scanner,Brand[] brands){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập id của sản phẩm: ");
//        int id = sc.nextInt();
//        System.out.println("Nhập tên sản phẩm: ");
//        String name = sc.nextLine();
//        sc.nextLine();
//        System.out.println("Nhập giá sản phẩm: ");
//        double price = sc.nextDouble();
//        System.out.println("Nhập tên hãng của sản phẩm: ");
//        for (Brand brand: brands){
//            System.out.println(brand);
//        }
//        System.out.println("Nhập brand: ");
//        int idBrand = sc.nextInt();
//        Brand newBrand = findBrandById(brands,idBrand);
//    }
//    public static Brand getBrand(){
//        Scanner sc = new Scanner(System.in);
//        Brand apple = new Brand(1,"Apple");
//        Brand samsung = new Brand(2,"Samsung");
//        Brand nokia = new Brand(3,"Nokia");
//        Brand[] brands= new Brand[]{apple,samsung,nokia};
//        Brand brand = new Brand();
//        int choice;
//        for (int i = 0; i < brands.length; i++) {
//            System.out.println(brands[i]);
//        }
//        System.out.println("Nhập lựa chọn brand: ");
//        choice = Integer.parseInt(sc.nextLine());
//         Brand newBrand = new Brand();
//        for (int i = 0; i < brands.length; i++) {
//            if(brands[i].getId() == choice);
//            newBrand = brands[i];
//        }
//        return new brand;
//    }
//}
