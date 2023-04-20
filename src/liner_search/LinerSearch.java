package liner_search;

public class LinerSearch {
    //KDL tra ra int[]
    public static int search(int[] arr, int key) {
        //tao int[]
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                //push i vao int[]
                return i;
            }
        }
        return -1; //return int[]
    }
    // Trả về -1 nếu không tìm thấy giá trị key trong mảng arr

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 50};
        int key = 50;
        int index = search(arr, key);
        if (index != -1) {
            System.out.println("Giá trị " + key + " được tìm thấy tại vị trí " + index);
        } else {
            System.out.println("Giá trị " + key + " không được tìm thấy trong mảng");
        }
    }
}
