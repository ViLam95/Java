package Arrays;

import java.util.Scanner;

public class ChangeCtoF {
    public static void main(String[] args) {
        double fahrenhei;
        double celsius;
        int choice;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenhei = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + Fahrenhei(fahrenhei));
                    break;
                case 2:
                    System.out.println("Enter celsius: ");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + Celsius(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (true);
    }
    public static double Celsius(double celsius){
        double fahrenhei = (9.0 / 5) * celsius + 32;
       return fahrenhei;
    }
    public static double Fahrenhei(double fahrenhei){
        double celsius = (fahrenhei - 32) / 1.8;
        return celsius;
    }
}
