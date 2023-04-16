package miniTest.list.view;

import miniTest.list.model.Person;
import miniTest.list.controller.PersonManage;

import java.util.Scanner;

public class MainPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonManage personManage = new PersonManage();
        int choice;
        do{
            System.out.println("-------Menu-------");
            System.out.println("1.List of people: ");//Hiển thị danh sách.
            System.out.println("2.Add a new person to the list: ");//Thêm người vào danh sách.
            System.out.println("3.Find a person's position in the list by name: ");//Tìm vị trí của một người theo tên.
            System.out.println("4.Remove a person from the list id: ");//Xoá một người trong danh sách theo mã.
            System.out.println("5.Edit a person's information by code: ");//Sửa thông tin một người theo mã.
            System.out.println("6.Sort the list by grade point average: ");//Sắp xếp danh sách theo điểm trung bình.
            System.out.println("7.Total score:");
            System.out.println("0.Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    personManage.displayAll();
                    break;
                case 2:
                    Person person = personManage.creatNewPerson();
                    personManage.addPerson(person);
                    break;
                case 3:
                    System.out.println("Enter the id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Students find in location: " + personManage.indexOfPerson(id));
                    break;
                case 4:
                    System.out.println("Enter the id to delete:");
                    int idDetele = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Student after being deleted by id: " + personManage.removePerson(idDetele));
                    personManage.displayAll();
                    break;
                case 5:
                    personManage.updatePerson();
                    personManage.displayAll();
                     break;
                case 6:
                    personManage.sortListByAverage();
                    System.out.println("List of students after applying according to the average score:");
                    personManage.displayAll();
                    break;
                case 7:
                    double sumAvg = personManage.calculateTotalScore();
                    System.out.println("Total score is: " + sumAvg);
                    break;
                case 0:
                    System.exit(0);
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Incorrect, please re-enter!");
            }
        }while (true);
    }
}
