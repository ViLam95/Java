package miniTest;

import java.util.Arrays;
import java.util.Scanner;

public class Advance {
    public static void delete(Product[] products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id you want to delete:");
        int delete = scanner.nextInt();
        Product[] arr = new Product[products.length - 1];
        int j = 0;
        for (int i = 0; i < products.length; i++) {
            if (delete != products[i].getId()) {
                arr[j] = products[i];
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void edit(Product[]products){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id you want to edit:");
        int edit = scanner.nextInt();
        for (int i = 0; i < products.length; i++) {
            if(edit==products[i].getId()){
                products[i]=Product.getProduct();
                System.out.println(Arrays.toString(products));
            }

        }

    }
}
