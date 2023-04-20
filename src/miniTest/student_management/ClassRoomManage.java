package miniTest.student_management;

import java.util.List;
import java.util.Scanner;

public class ClassRoomManage implements ClassManage<ClassRoom>  {
    private List<ClassRoom> classRooms;
    public static Scanner scanner = new Scanner(System.in);

    public ClassRoomManage() {
    }

    public ClassRoomManage(List<ClassRoom> classRooms) {
        this.classRooms = classRooms;
    }
    @Override
    public ClassRoom createClassroom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new classroom name:");
        String name = scanner.nextLine();
        ClassRoom classroom = new ClassRoom(name);
        classRooms.add(classroom);
        System.out.println("New classroom created: " + classroom.getName() + " (ID: " + classroom.getId() + ")");
        return classroom;
    }
    @Override
    public ClassRoom updateClassroom() {
        System.out.println("Enter classroom ID to update:");
        int id = scanner.nextInt();
        for (ClassRoom classroom : classRooms) {
            if (classroom.getId() == id){
                System.out.println("Enter new class:");
                String name = scanner.nextLine();
                classroom.setName(name);
            }
                break;
            }
        return null;
    }

}
