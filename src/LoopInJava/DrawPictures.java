package LoopInJava;

import java.util.Scanner;

public class DrawPictures {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print isosceles triangle");
        int hight;
        System.out.println("Enter the height of the triangle: ");
        hight = input.nextInt();
        for (int a = 1; a <= hight; a++){
            for (int b = 1; b <= a; b++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println("ngăn cách tôi ra------------------------");
        for (int a = 7; a >= 1; a--){
            for (int b = 1; b <= a; b++ ){
                System.out.print("  *");
            }
            System.out.println();
        }
        int height;
        int width;
        System.out.println("2. Print the rectangle");
        System.out.println("Height = ");
        height = input.nextInt();
        System.out.println("Wight = ");
        width = input.nextInt();
        for(int c = 1; c <= height; c++){
            for(int j = 1; j <= width; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        System.out.println("Exit");
    }
}