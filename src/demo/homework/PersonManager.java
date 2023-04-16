package demo.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PersonManager {
    private final Address[] addresses;//Khai báo một mảng Address;
    private Person[] persons;//Khai báo mảng Person;
    private final Scanner scanner;//Khai báo biến toàn cục Scanner cho cả chương trình.


    //Tạo phương thức PersonManager.
    public PersonManager() {
        addresses = new Address[]{new Address(1, "HN"),
                new Address(2, "HCM")};//Tạo đối tượng mới cho addresses
        persons = new Person[0];
        scanner = new Scanner(System.in);
    }
    //Tạo một person mới
    public void createPerson() {
        Person person = getPerson();
        Person[] arr = Arrays.copyOf(persons, persons.length + 1);//Copy mảng.
        arr[persons.length] = person;
        persons = arr;
    }
    //
    public Address getAddressById(int id) {
        for (Address address : addresses) {
            if (address.getId() == id) {
                return address;
            }
        }
        return null;
    }

    public int getPersonById(int id) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void deletePerson() {
        System.out.println("Nhập id muốn xóa: ");
        int idDelete = Integer.parseInt(scanner.nextLine());
        int indexDelete = getPersonById(idDelete);
        Person[] personDelete = new Person[persons.length - 1];
        if (indexDelete != -1) {
            System.arraycopy(persons, 0, personDelete, 0, indexDelete);
            System.arraycopy(persons, indexDelete + 1,
                    personDelete, indexDelete,
                    persons.length - indexDelete - 1);//Copy mảng
            persons = personDelete;
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("Không tồn tại id như trên!");
        }
    }
    //Thêm một dữ liệu person mới
    public void updatePerson() {
        System.out.println("Nhập id muốn xóa: ");//Hiển thị
        int idUpdate = Integer.parseInt(scanner.nextLine());//Nhập lựa chọn id
        int indexUpdate = getPersonById(idUpdate);
        if (indexUpdate != -1) {
            System.out.println("Nhập tên mới: ");
            String name = scanner.nextLine();
            if (!name.equals("")) {
                persons[indexUpdate].setName(name);
            }
            System.out.println("Nhập tuổi mới: ");
            String age = scanner.nextLine();
            if (!age.equals("")) {
                persons[indexUpdate].setAge(Integer.parseInt(age));
            }
            System.out.println("Nhập gender mới: ");
            String gender = scanner.nextLine();
            if (!gender.equals("")) {
                persons[indexUpdate].setGender(gender);
            }
            displayAllAddress();
            System.out.println("Nhập địa chỉ: (chọn theo id) ");
            String choice = scanner.nextLine();
            if (!choice.equals("")) {
                Address address = getAddressById(Integer.parseInt(choice));
                if (address != null) {
                    persons[indexUpdate].setAddress(address);
                }
            }
        }
    }

    public void sortPersonByName() {
        Arrays.sort(persons);
        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void displayAddPersonByAddress() {
        displayAllAddress();
        System.out.println("Chọn địa chỉ muốn hiển thị thông tin: (chọn theo id)");
        int choice = Integer.parseInt(scanner.nextLine());
        Address address = getAddressById(choice);
        if (address != null) {
            boolean check = false;//gán cờ để check
            for (Person person : persons) {
                if (person.getAddress().equals(address)) {
                    System.out.println(person);
                    check = true;
                }
            }
            if (!check) {
                System.out.println("Không có Person nào có Address này!");
            }
        } else {
            System.out.println("Không tồn tại id như đã nhập!");
        }
    }

    public void displayAllAddress() {
        for (Address address : addresses) {
            System.out.println(address);
        }
    }

    public Person getPerson() {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        displayAllAddress();
        System.out.println("Nhập địa chỉ: (chọn theo id) ");
        int choice = Integer.parseInt(scanner.nextLine());
        Address address = getAddressById(choice);
        if (address == null) {
            address = new Address();
        }
        return new Person(name,age,gender,address);
    }

    public void displayAddPerson() {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
