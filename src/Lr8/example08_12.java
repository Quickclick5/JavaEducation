package Lr_08.Example;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class example08_12 {

    public static void main(String[] args) throws IOException {
        try{
            InputStream inFile = new FileInputStream("MyFile1.txt");
            readAllByByte(inFile);
            System.out.print("\n");
            inFile.close();

            InputStream inUrl = new URL("http://google.com").openStream();
            readAllByByte(inUrl);
            System.out.print("\n");
            inUrl.close();

            InputStream inArray = new ByteArrayInputStream(new byte[]{5,8,9,4,1});
            readAllByByte(inArray);
            System.out.print("\n");
            inArray.close();
        }
        catch (IOException mistake) {
            System.out.println("Произошла ошибка. Причина: "+ mistake);
        }
    }
    public static void readAllByByte(InputStream in) throws IOException {
        while (true){
            int one = in.read();
            if (one != -1){
                System.out.print((char)one);
            }
            else {
                System.out.println("\n"+"Конец");
                break;
            }
        }
    }
}