package collection_framework.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    private final Map<String,String> dictionary = new HashMap<>();
    private void themTu(String tuKhoa, String yNghia){

        this.dictionary.put(tuKhoa, yNghia);
    }
    private String suaTu(String tuKhoa, String yNghia){
        return this.dictionary.replace(tuKhoa, yNghia);
    }
    private String traTu(String tuKhoa){
        String yNghia = this.dictionary.get(tuKhoa);
        return yNghia;
    }
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("========   Tìm kiếm   ========");
            System.out.println("1.Thêm từ mới:");
            System.out.println("2.Tra từ điển:");
            System.out.println("3.Sửa từ điển:");
            System.out.println("Nhập lựa chọn của bạn: ");
            System.out.println("Exit!");
            choice = scanner.nextInt(); scanner.nextLine();
            if (choice == 1){
                System.out.println("Nhập vào từ khoá:");
                String tuKhoa = scanner.nextLine();
                System.out.println("Nhập vào ý nghĩa:");
                String yNghia = scanner.nextLine();
                dictionary.themTu(tuKhoa,yNghia);
                System.out.println("Thêm thành công ");
            } else if (choice == 2) {
                System.out.println("Nhập vào từ khoá:");
                String tuKhoa = scanner.nextLine();
                System.out.println("Ý nghĩa của từ là: " + dictionary.traTu(tuKhoa));
            }
        }while (true);
    }

}
