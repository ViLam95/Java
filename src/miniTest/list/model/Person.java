package miniTest.list.model;

public class Person {
    private int id;
    private static int autoId = 1;
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.id = autoId++;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id= " + autoId +
                ", name='" + name +
                ", age=" + age +
                '}';
    }
}
