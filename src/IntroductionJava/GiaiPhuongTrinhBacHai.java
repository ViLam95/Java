package IntroductionJava;

import java.util.Scanner;

public class GiaiPhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner equation = new Scanner(System.in);
        double a, b, c;
        System.out.println("a is: ");
        a = equation.nextDouble();
        if (a != 0) {
            System.out.println();
            System.out.println("b is: ");
            b = equation.nextDouble();
            System.out.println("c is: ");
            c = equation.nextDouble();
            double delta = Math.pow(b, 2) - 4 * a * c;
            double x;
            double x1;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                x = -b / 2*a;
                System.out.println("phuong trinh co nghiem kep" + x);
            }else {
                x = (-b + Math.sqrt(delta)) / (2*a);
                x1 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.println("Phuong trinh co 2 nghiem " +x +"x2=" + x1);
            }
        }else{
            System.out.println("Nhập lại a");
        }
    }
}
