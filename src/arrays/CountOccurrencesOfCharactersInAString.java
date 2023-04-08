package arrays;

import java.util.Scanner;

public class CountOccurrencesOfCharactersInAString {
    public static void main(String[] args) {
        String str;
        char kyTu = 'a';
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string: ");
        str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++ ){
            if(str.charAt(i) == kyTu){
                count++;

            }
        }
        System.out.println("Number of occurrences of the character: " + kyTu + " trong chuỗi "+
                str + " = " + count);
    }
}
