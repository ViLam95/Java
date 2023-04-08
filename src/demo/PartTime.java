package demo;

public class PartTime extends Employed {
    public int worktime;
    public double salary;

    public PartTime(String id, String name, int age, int worktime) {
        super(id, name, age);
        this.worktime = worktime;

    }

    public int getWorktime() {
        return worktime;
    }

    public double getSalary() {
        return salary = worktime*25000;
    }

    @Override
    public String toString() {
        return "PartTime{" +
                "worktime=" + worktime +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
