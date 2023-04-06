package IntroductionJava;

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Your weight: ");
        weight = sc.nextDouble();
        System.out.println("Your height: ");
        height = sc.nextDouble();
        bmi = weight / Math.pow(height,2);
        if(bmi < 18.5){
            System.out.println("bmi is: " + bmi + " Underweight");
        }
        else if (bmi < 25.0){
            System.out.println("bmi is: " + bmi +" Normal");
        }
        else if (bmi < 30.0) {
            System.out.println("bmi is: " + bmi +" Overweight");
        }
        else {
            System.out.println("bmi is: " + bmi +" Obese");
        }
    }
}
