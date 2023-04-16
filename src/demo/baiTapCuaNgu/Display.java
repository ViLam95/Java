package demo.baiTapCuaNgu;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FullTime f1 = new FullTime(1, "Hieu", 28, 2000000, 5);
        FullTime f2 = new FullTime(2, "Lam", 20, 2000000, 5);
        PartTime p1 = new PartTime(3, "Minh", 32, 20000, 32);
        PartTime p2 = new PartTime(4, "Dung", 19, 20000, 28);
        Employee[] employees = {f1, f2, p1, p2};
        do {
            System.out.println("Menu");
            System.out.println("1.Hiển thị nhân viên fullTime: ");
            System.out.println("2.Hiển thị nhân viên partTime: ");
            System.out.println("3.Thêm một nhân viên mới fullTime hoặc parttime: ");
            System.out.println("4.Sửa một bạn nhân viên mà bạn cần sửa: ");
            System.out.println("5.Xoá một nhân viên ");
            System.out.println("0.Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < employees.length; i++) {
                        if (employees[i] instanceof FullTime) {
                            System.out.println(employees[i]);
                        }
                    }
                    break;
                case 2:
                    for (Employee employee : employees) {
                        if (employee instanceof PartTime) {
                            System.out.println(employee);
                        }
                    }
                    break;
                case 3:
                    employees = addStaff(employees);
                    break;
                case 4:
                    updateStaff(employees);
                    break;
                case 5:
                    delete(employees);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    public static void delete(Employee[] employees) {
        Scanner scanner = new Scanner(System.in);
        Employee[] staff = new Employee[employees.length - 1]; //Tao ra mot mang moi
        System.out.println("Xoá thằng nhân viên mà bạn ghét :");
        int delete = scanner.nextInt();
        int j = 0;
        for (Employee employee : employees) {
            if (delete != employee.getId()) {
                staff[j] = employee;
                j++;
            }
        }
        for (int k = 0; k < j; k++) {
            System.out.println(employees[k]);
        }
    }

    public static Employee[] addStaff(Employee[] employees) {
        Employee[] staff2 = new Employee[employees.length + 1];
        System.arraycopy(employees, 0, staff2, 0, employees.length);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add FullTime: ");
        System.out.println("Add Partime: ");
        int input1 = Integer.parseInt(scanner.nextLine());
        switch (input1) {
            case 1:
                FullTime fullTime = new FullTime(5, "Duong", 22, 2000000, 3);
                staff2[staff2.length - 1] = fullTime;
                System.out.println(fullTime);
                break;
            case 2:
                PartTime partTime = new PartTime(5, "Ngu", 21, 20000, 30);
                staff2[staff2.length - 1] = partTime;
                System.out.println(partTime);
                break;
        }
        return staff2;
    }

    public static void updateStaff( Employee[] employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id cần sửa: ");
        int update = Integer.parseInt(scanner.nextLine());
        for (Employee employee : employees) {
            if (update == employee.getId()) {
                System.out.println("Name: ");
                String name = scanner.nextLine();
                employee.setName(name);
                System.out.println("Age: ");
                int age = scanner.nextInt();
                employee.setAge(age);
                double salary = scanner.nextDouble();
                employee.setSalary(salary);
                System.out.println("Salary: ");
                if (employee instanceof FullTime) {
                    System.out.println("Experence: ");
                    int time = scanner.nextInt();
                    ((FullTime) employee).setYearOfExp(time);
                } else {
                    System.out.println("Work Time: ");
                    int time = scanner.nextInt();
                    ((PartTime) employee).setWorkTime(time);
                }
            }
        }
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}
