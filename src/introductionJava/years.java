package introductionJava;

import java.util.Scanner;

public class years {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter year: ");
        year = sc.nextInt();
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println("Năm nhuận là năm: " + year);
                }else{
                    System.out.println("Năm "+ year + "không phải là năm nhuận");
                }
            }else{
                System.out.println("Năm nhuận là năm " + year);
            }
        }else{
            System.out.println("Năm" + year + "không phải là năm nhuận");
        }
    }
}
