package demo.baiTapCuaNgu.bai_tap_pt;

import java.util.Scanner;

public class MainCaculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Nhập vào số nguyên a:");
            int a = scanner.nextInt();

            System.out.println("Nhập vào số nguyên b:");
            int b = scanner.nextInt();

            if (a == 0){
                throw new IllegalArgumentException("A phải khác 0");
            }
            double x = (double) -b /a;
            System.out.println("Nghiệm của phương trình" + a + "x + " + b + " = 0 là: " + x);
        }catch (Exception e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
        try{
            System.out.println("Nhập vào số nguyên a:");
            int a = scanner.nextInt();

            System.out.println("Nhập vào số nguyên b:");
            int b = scanner.nextInt();

            System.out.println("Nhập vào số nguyên c:");
            int c = scanner.nextInt();

            double delta = Math.pow(b,2) - 4 * a * c;

            if(delta < 0){
                throw new Exception("Phương trình vô nghiệm!");
            }else if (delta == 0){
                double x = (double) -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép x = " + x);
            }else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }catch (Exception e){
            System.out.println("Lỗi");
        }
    }

}
