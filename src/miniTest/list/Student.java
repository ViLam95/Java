package miniTest.list;

import java.util.List;

public class Student extends Person {
    private double averagePoint;

    public Student() {
    }

    public Student(String name, int age, double averagePoint) {
        super(name, age);
        this.averagePoint = averagePoint;
    }


    public double getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(double averagePoint) {
        this.averagePoint = averagePoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                " id= " + super.getId() + ", name= " + super.getName() +
                ", age= " + super.getAge() +
                ", averagePoint= " + averagePoint +
                '}';
    }
}
