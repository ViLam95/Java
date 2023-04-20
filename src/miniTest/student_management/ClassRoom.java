package miniTest.student_management;

public class ClassRoom {
    private int id;
    private int autoId = 1;
    private String name;

    public ClassRoom() {
    }

    public ClassRoom(String name) {
        this.id = autoId++;
        this.name = name;
    }

    public ClassRoom(int i, String c01) {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAutoId() {
        return autoId;
    }

    public void setAutoId(int autoId) {
        this.autoId = autoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "id=" + autoId +
                ", name='" + name + '\'' +
                '}';
    }
}
