package miniTest.student_management;

public interface Manage <Student>{
    Student creatStudent();
    Student editStudent();
    Student removeStudent();
    Student findOfStudent();
    void displayAll();

}
