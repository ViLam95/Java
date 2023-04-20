package stack_queue;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseUsingStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng: ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        System.out.println("Nhập phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < n; i++) {//Lấy phần tử từ Stack để lấy ra kết quả.
            arr[i] = stack.pop();
        }
        System.out.println("Mảng đã bị đảo ngược : ");
        System.out.println(Arrays.toString(arr));// Sử dụng hàm Arrays.toString để in ra kết quả
    }
}
