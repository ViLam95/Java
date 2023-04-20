package collection_framework.product;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManage = new ProductManager();
        int choice;
        do {
            System.out.println("========  Menu  ========");
            System.out.println("1.Thêm sản phẩm:");
            System.out.println("2.Sửa thông tin sản phẩm theo id:");
            System.out.println("3.Xoá sản phẩm theo id:");
            System.out.println("4.Hiển thị danh sách sản phẩm:");
            System.out.println("5.Tìm kiếm sản phẩm theo tên:");
            System.out.println("6.Sắp xếp sản phẩm tăng dần theo giá:");
            System.out.println("7.Sắp xếp sản phẩm giảm dần theo gía:");
            System.out.println("0.Exit!");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    productManage.addProduct();
                    break;
                case 2:
                    productManage.updateProduct();
                    break;
                case 3:
                    productManage.removeProduct();
                    break;
                case 4:
                    productManage.displayProduct();
                    break;
                case 5:
                    productManage.searchProduct();
                    break;
                case 6:
                    productManage.sortProductPriceAscending();
                    break;
                case 7:
                    productManage.sortProductPriceDescending();
                    break;
                case 0:
                    System.exit(0);
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Sản phẩm không tồn tại, xin mời nhập lại!");
            }
        } while (true);
    }
}