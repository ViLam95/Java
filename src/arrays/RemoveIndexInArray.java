package arrays;

import java.util.Arrays;


public class RemoveIndexInArray {
    public static void main(String[] args) {
        int [] arr ={4, 6, 8, 10, 12, 14};
        System.out.println("First Array Is: " + Arrays.toString(arr));
        int X = 3;
        int reality = arr.length;
        for (int i = X; i<arr.length-1; i++){
            arr[i] = arr[i+1];
            }
        System.out.println("After removing the index 3:");
        for (int i =0; i < reality; i++){
            System.out.println(arr[i]);
        }
    }
}
