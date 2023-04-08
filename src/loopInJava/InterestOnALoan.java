package loopInJava;

import java.util.Scanner;

public class InterestOnALoan {
    public static void main(String[] args) {
        double money, interestRate;
        int month;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        System.out.println("Enter month: ");
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
            System.out.println("Total of interest: " + totalInterest);

        }
    }
}
