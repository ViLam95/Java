package miniTest.student_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManage implements Manage<Student>{
    private final List<Student> students;
    public static Scanner scanner = new Scanner(System.in);

    public StudentManage() {
        students = new ArrayList<>();
    }
    public static ClassRoom getClassroom() {
        ClassRoom classroom1 = new ClassRoom(1, "C01");
        ClassRoom classroom2 = new ClassRoom(2, "C02");
        ClassRoom classroom3 = new ClassRoom(3, "C03");
        ClassRoom[] classrooms = {classroom1, classroom2, classroom3};
        for (ClassRoom classroom : classrooms) {
            System.out.println(classroom.getId() + ". " + classroom.getName());
        }

        ClassRoom classroom = new ClassRoom();
        int choice;
        System.out.println("Chọn lớp");
        choice = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < classrooms.length; i++) {
            if (classrooms[i].getId() == choice) {
                classroom = classrooms[i];
            }
        }
        return classroom;
    }


    @Override
    public Student creatStudent() {
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Gender selection (Male) , (Female) , (Other!):");
        String gender = "";
        int genderChoice = Integer.parseInt(scanner.nextLine());
            switch (genderChoice) {
                case 1:
                    gender = "Male";
                    break;
                case 2:
                    gender = "Female";
                    break;
                default:
                     System.out.println("Other !");
                    break;
            }
        System.out.println("Enter the score from 0 to 10: ");
            double avgPoint = Double.parseDouble(scanner.nextLine());
        for (Student student: students) {
            if (avgPoint<= 10 && avgPoint >=6){
                System.out.println(student);
                break;
            }else {
                System.out.println("Invalid average point! Score point must be between 0 and 10.");
                break;
            }
        }
        System.out.println("Enter the age:");
        int age = scanner.nextInt();
        for (Student student: students) {
            if (age < 6 || age > 60){
                System.out.println(student);
                break;
            }else{
                System.out.println("Invalid age! Age must be between 6 and 60.");
            }
        }
        ClassRoom classRoom = getClassroom();
        Student student = new Student  (name,age,gender,avgPoint,classRoom);
        students.add(student);
        return student;
    }

    @Override
    public Student editStudent() {
        System.out.println("Enter student ID to edit: ");
        int id = scanner.nextInt();
        for (Student student: students){
            if (student.getId() == id){
                System.out.println("Enter new name: ");
                String name = scanner.nextLine();
                System.out.println("Enter new age:  ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("Choose gender (1.Male, 2.Female): ");
                String gender = scanner.nextLine();
                System.out.println("Enter the score point: ");
                Double avgPoint = Double.parseDouble(scanner.nextLine());
                student.setName(name);
                student.setAge(age);
                student.setGender(gender);
                student.getAvgPoint(avgPoint);
            }
        }
        return null;
    }

    @Override
    public Student removeStudent() {
        System.out.println("Enter the id to delete:");
        int id = scanner.nextInt();

        for (Student student: students) {
            if (student.getId() == id){
                students.remove(student);
                System.out.println("Deleted successfully");
            }
            else{
                System.out.println("Student not found");
            }
        }
        return null;
    }

    @Override
    public Student findOfStudent() {
        System.out.println("Find a student by ID:");
        int id = scanner.nextInt();
        for (Student student: students) {
            if (student.getId() == id){
                System.out.println(student);
            }
            else {
                System.out.println("Student not found");
            }
        }
        return null;
    }

    @Override
    public void displayAll() {
        System.out.println("List of student");
        for (Student student: students) {
            System.out.println(student);
        }
    }
}
