package liner_search;
public class BinarySearch {
    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right)/ 2;

            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int x = 18;

        int result = binarySearch(arr, x);

        if (result == -1) {
            System.out.println("Không tìm thấy giá trị phần tử");
        } else {
            System.out.println("Phần tử được tìm thấy ở vị trí index " + result);
        }
    }
}
