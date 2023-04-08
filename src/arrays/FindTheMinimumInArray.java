package arrays;

public class FindTheMinimumInArray {
    public static void main(String[] args) {
        int [] arr = {2, 6, 7, 9, 11};
        int index = (int) minValue(arr);
        System.out.println("The smallest element in the array is: " +arr[index] + " at position " + index);
    }

    private static double minValue(int[] array) {
        int index = 0;
        for (int j =0; j < array.length; j++ ){
            if (array[j] < array[index]) {
                index = 1;
                break;
            }
        }
        return index;
    }
}
