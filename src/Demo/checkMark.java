package Demo;

import java.util.Arrays;

public class checkMark {
    public static void main(String[] args) {
        Student student1 = new Student("Lam",29,10,10,10);
        Student student2 = new Student("Hieu",29,10,10,10);
        Student student3 = new Student("Duong",29,10,7,10);
        Student student4 = new Student("Dung",20,2,3,4);
        Student[]students = {student1, student2, student3, student4};
        double min = students[0].avg();
        int point = 0;
        for (int i = 0; i< students.length; i++){
            if(students[i].avg() < min){
                point = i;
            }
        }
        System.out.printf("Học sinh có điểm TB thấp nhất là: " + students[point].toString());
    }
}
