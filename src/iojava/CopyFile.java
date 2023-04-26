package iojava;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    public static void main(String[] args) {
        File demoFile = new File("/Users/viquoclam/IdeaProjects/introduction_javacore/src/iojava/demo.txt");
        File copFile = new File("/Users/viquoclam/IdeaProjects/introduction_javacore/src/iojava/cop.txt");
        try{
            Files.copy(demoFile.toPath(), copFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
       }catch(IOException e){
           e.printStackTrace();
       }
    }
}
