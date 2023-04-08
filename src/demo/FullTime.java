package demo;

public class FullTime extends Employed {
    public int yearOfExperience;
    public int salary;

    public FullTime(String id, String name, int age, int yearOfExperience) {
        super(id, name, age);
        this.yearOfExperience = yearOfExperience;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public int getSalary() {
        return salary = yearOfExperience*2000000;
    }

    @Override
    public String toString() {
        return "FullTime{" +
                "yearOfExperience=" + yearOfExperience +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
