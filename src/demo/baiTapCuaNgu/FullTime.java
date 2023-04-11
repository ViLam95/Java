package demo.baiTapCuaNgu;

import java.util.Scanner;

public class FullTime extends Employee {
    private int yearOfExp;
    public FullTime(int id, String name, int age, double salary, int yearOfexp) {
        super(id, name, age, salary);
        this.yearOfExp = yearOfexp;
    }

    @Override
    public String toString() {
        return "FullTime{" +
                "yearOfexp=" + yearOfExp +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public int getYearOfExp() {
        return yearOfExp;
    }

    public void setYearOfExp(int yearOfExp) {
        this.yearOfExp = yearOfExp;
    }
}
