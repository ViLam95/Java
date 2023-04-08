package arrays;

import java.util.Scanner;

public class FindIndexInArrays {
    public static void main(String[] args) {
        String [] studens ={"Lam","Duong","Hieu","Dung","Thai","Minh"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of students: ");
        String input_name = scanner.nextLine();
       boolean flag = false;
       for (int i = 0; i <= studens.length; i++){
           if (studens[i].equals(input_name)){
               System.out.println("Position of the students in the list: " + input_name + "is: "+i);
               flag = true;
               break;
           }

       } if(!flag){
            System.out.println("Not found name of students in the list");
        }
    }
}
