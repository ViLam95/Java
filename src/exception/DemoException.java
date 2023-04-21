package exception;

import java.util.ArrayList;
import java.util.Scanner;

import static arrays.FindTheMinimumInArray.minValue;

public class DemoException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// checked;
        System.out.println("Nhập n là một số nguyên:");
        int n = scanner.nextInt();
        System.out.println("Số nguyên là: " + n);

        // logic.
        ArrayList<Integer> arrayList = new ArrayList<>(2);
        System.out.println(arrayList.get(3));

    }
}

