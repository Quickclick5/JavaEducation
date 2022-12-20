package Lr8;

import java.io.File;

public class example08_11 {
    public static void main(String[] args) {
        try{
            File f1 = new File("TestFile1.txt");
            f1.createNewFile();
            if (f1.exists()){
                System.out.println("Операция прошла успешно");
                System.out.println("Полный путь к файлу номер 1: "+f1.getAbsolutePath());
            }

            File f2 = new File("C:\\TestFile2.txt");
            f2.createNewFile();
            System.out.println("Полный путь к файлу номер 2: "+f2.getAbsolutePath());
            File f3 = new File("C:\\Users\\lerak\\IdeaProjects\\JavaEducation\\src\\Lr8\\example11");
            f3.mkdirs();
            System.out.println("Полный путь к файлу №3: "+f3.getAbsolutePath());
        } catch (Exception mistake){
            System.out.println("Произошла ошибка. Причина: " + mistake);
        }
    }
}
