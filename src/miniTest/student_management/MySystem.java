package miniTest.student_management;

import java.util.Scanner;

public class MySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManage studentManage = new StudentManage();
        int choice;
        do {
            System.out.println("=============== MENU ===============");
            System.out.println("1.Creat a new student: ");
            System.out.println("2.Edit a student by ID: ");
            System.out.println("3.Delete a student by ID: ");
            System.out.println("4.Find a student by ID: ");
            System.out.println("5.Display a student by ID: ");
            System.out.println("6.Display all student by ID: ");
            System.out.println("7.Display all student by Classroom: ");
            System.out.println("8.Show all students by academic level");
            System.out.println("0.Exit!");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    studentManage.creatStudent();
                    break;
                case 2:
                    studentManage.editStudent();
                    break;
                case 3:
                    studentManage.removeStudent();
                    break;
                case 4:
                    studentManage.findOfStudent();
                    break;
                case 5:
                    studentManage.displayAll();
                    break;
//                case 6:
//                    break;
//                case 7:
//                    break;
//                case 8:
//                    break;
                case 0: System.exit(0);
                break;
                default:
                    System.out.println("Student does not exist, please re-enter");
            }
        } while (true);

    }
}
