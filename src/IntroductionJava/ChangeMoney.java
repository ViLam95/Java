package IntroductionJava;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner money = new Scanner(System.in);
        System.out.println("Please choice your money to change : ");
        usd = money.nextDouble();
        double change = usd * vnd;
        System.out.println("The amount exchanged is : " + change);
    }
}
