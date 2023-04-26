package minitest.baitap_26_04.service.impl;

import minitest.baitap_26_04.model.Classroom;
import minitest.baitap_26_04.model.Student;

import java.io.*;
import java.util.ArrayList;

public class IoFile {
    public static void writeFileStudent(ArrayList<Student> students){
        File f = new File("/Users/viquoclam/Documents/Java - module 2/Bai_tap_Quan/Module_2_C0223/src/minitest/baitap_19_04/model/student.txt");
        try{
            if(!f.exists()){
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f));
            for (Student student:students){
                bufferedWriter.write(student.toString() + "\n");
            }
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }
    }
    public static void readFileStudent(ArrayList<Student> students){
        try {
            File f = new File("/Users/viquoclam/Documents/Java - module 2/Bai_tap_Quan/Module_2_C0223/src/minitest/baitap_19_04/model/student.txt");
            FileReader fileReader = new FileReader(f);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] str;
            while ((line = bufferedReader.readLine()) != null){
                str = line.split(",");
                int id = Integer.parseInt(str[0]);
                String name = str[1];
                int age = Integer.parseInt(str[2]);
                String gender = str[3];
                Double avgPoint = Double.parseDouble(str[4]);
                Classroom classroom = new Classroom(str[5]);
                int id1 = 0;
                students.add(new Student(id,name,age,gender,avgPoint,classroom, id1));
            }
            bufferedReader.close();
            fileReader.close();
        }catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }
    }
    public static void writeFileClassroom(ArrayList<Classroom> classrooms){
        File f = new File("/Users/viquoclam/Documents/Java - module 2/Bai_tap_Quan/Module_2_C0223/src/minitest/baitap_19_04/model/classroom.txt");
        try{
            if(!f.exists()){
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f));
            for (Classroom classroom:classrooms){
                bufferedWriter.write(classroom.toString() + "\n");
            }
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }
    }
    public static void readFileClassroom(ArrayList<Classroom> classrooms) throws FileNotFoundException {
        try{
            FileReader fileReader = new FileReader("/Users/viquoclam/Documents/Java - module 2/Bai_tap_Quan/Module_2_C0223/src/minitest/baitap_19_04/model/classroom.txt");
            BufferedReader bufferedReader = new BufferedReader(new BufferedReader(fileReader));
            String ch;
            String[] str;
            while ((ch = bufferedReader.readLine()) != null){
                str = ch.split(",");
                classrooms.add(new Classroom(String.valueOf(Integer.parseInt(str[0], Integer.parseInt(str[1])))));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
