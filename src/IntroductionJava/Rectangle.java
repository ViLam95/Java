package IntroductionJava;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner rec = new Scanner(System.in);
        double width,height;
        System.out.println(" chiều rộng: " );
        width = rec.nextDouble();
        System.out.println(" chiều dài: " );
        height = rec.nextDouble();
        double area = width * height;
        System.out.println("Diện tích hình chữ nhật là: " + area);
    }
}
