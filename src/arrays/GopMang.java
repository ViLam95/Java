package arrays;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int [] array1 = {1,2,3};
        int [] array2= {4,5,6};
        int length = array1.length + array2.length;//biến length
        int [] result = new int[length];
        int count = 0;
        for (int i = 0;i <array1.length;i++){
            result[count] = array1[i];
            count ++;
        }
        for (int j = 0; j<array2.length; j++){
            result[count] = array2[j];
            count++;
        }
        System.out.println(Arrays.toString(result));
    }
}
