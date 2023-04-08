package introductionJava;

import java.util.Scanner;

public class PhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n vào: ");
        double n = sc.nextDouble();
        double sum = 0;
        for (double i = 1; i<=n ; i++){
            sum += i/(i+1);
        }
        System.out.println("Tổng của dãy là: "+ sum);
    }
}
