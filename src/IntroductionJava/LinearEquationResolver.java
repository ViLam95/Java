package IntroductionJava;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner pt = new Scanner(System.in);
        float a,b,c;
        System.out.println("a is: " );
        a = pt.nextFloat();
        System.out.println("b is: ");
        b = pt.nextFloat();
        System.out.println("c is: ");
        c = pt.nextFloat();
        if (a != 0){
            float answer = (c-b) / a;
            System.out.println("Kết quả là :"+ answer);
        }else{
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
