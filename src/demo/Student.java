package demo;



public class Student {

        String name;
        int age;
        double math;
    double physical;
    double chemical;



    public Student(String name, int age, double math, double physical, double chemical) {
        this.name = name;
        this.age = age;
        this.math = math;
        this.physical = physical;
        this.chemical = chemical;

    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public void setPhysical(double physical) {
        this.physical = physical;
    }

    public void setChemical(double chemical) {
        this.chemical = chemical;
    }


    public double getMath() {
        return math;
    }

    public double getPhysical() {
        return physical;
    }

    public double getChemical() {
        return chemical;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public double avg(){
        return (math + physical + chemical) /3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", math=" + math +
                ", physical=" + physical +
                ", chemical=" + chemical +
                ", avg=" + avg() +
                '}';
    }
}
