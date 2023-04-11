package demo.baiTapCuaNgu;

import java.util.Scanner;

public class PartTime extends Employee {
    private int workTime;

    public PartTime(int id, String name, int age, double salary, int workTime) {
        super(id, name, age, salary);
        this.workTime = workTime;
    }


    @Override
    public String toString() {
        return "PartTime{" +
                "workTime=" + workTime +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public int getWorkTime() {
        return workTime;
    }
    public void setWorkTime(int workTime){
        this.workTime = workTime;
    }
}
