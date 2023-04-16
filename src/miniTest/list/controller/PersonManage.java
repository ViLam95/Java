package miniTest.list.controller;

import miniTest.list.model.Person;
import miniTest.list.model.Student;

import java.util.*;

public class PersonManage implements Manage {
    private final ArrayList<Person> people;

    public PersonManage() {
        people = new ArrayList<>();

    }

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void displayAll() {
        if (people.isEmpty()){
            System.out.println("List of student is Empty ");
        }else {
            System.out.println("List of student: ");
            for (Person person : people) {
                System.out.println(person);
            }
        }
    }

    @Override
    public void addPerson(Person person) {
        people.add(person);
        System.out.println("Add" + person.getName() + "to the list.");
        displayAll();
    }
//    Tim vi tri:
    public int indexOfPerson(int id) {
    int index = -1;
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getId() == id){
                index = i;
            }
        }
        return index;
    }

    @Override
    public int removePerson(int id) {
        int index = indexOfPerson(id);
        if (index != -1){
            people.remove(index);
        }else{
            System.out.println("This id is not in the list");
        }
        return index;
    }

    @Override
    public void updatePerson() {
        System.out.println("Enter the id of the person who needs to correct the information: ");
        int id = scanner.nextInt();
        int locationPerson = indexOfPerson(id);
        if( locationPerson != -1){
            Person person = people.get(locationPerson);
            System.out.println("Information that needs to be corrected:");
            System.out.println("ID " + person.getId() +
                    ", Name " + person.getName() +
                    ", Age " + person.getAge());
            System.out.println("Enter new name: ");
            people.get(locationPerson).setName(scanner.nextLine());
            scanner.nextLine();
            System.out.println("Enter age:");
            people.get(locationPerson).setAge(Integer.parseInt(scanner.nextLine()));
            if(people.get(locationPerson) instanceof Student){
                System.out.println("Enter the new Average:");
                ((Student) people.get(locationPerson)).setAveragePoint(Double.parseDouble(scanner.nextLine()));
            }
        } else{
            System.out.println("No id just entered in the list");
        }
    }

    @Override
    public void sortListByAverage() {
        ArrayList<Student> students = new ArrayList<>();// Tạo một danh sách mới là students.
        for (Person person: people){      // Lọc từ danh sách people sang danh sách students.
            if (person instanceof Student){
                students.add((Student) person);
            }
        }
        students.sort((o1, o2) -> Double.compare(o2.getAveragePoint(), o1.getAveragePoint()));// So sánh hai giá trị double o2 và o1
        int index = 0;
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i) instanceof  Student){
                people.set(i, students.get(index));
                index++;
            }
        }
    }

    @Override
    public double calculateTotalScore() {
        double sumAvg = 0;
        for (Person person: people){
            if (person instanceof Student){
                sumAvg += ((Student) person).getAveragePoint();
            }

        }
        return sumAvg;
    }

    public Student creatNewPerson(){
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        System.out.println("Enter the age:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter average point:");
        double averagePoint = Double.parseDouble(scanner.nextLine());
        return new Student(name, age, averagePoint);
    }
}