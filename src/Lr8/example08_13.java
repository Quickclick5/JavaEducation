package Lr_08.Example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class example08_13 {
    public static void readAllByArray(InputStream in) throws IOException {
        byte[] a = new byte[5];
        while (true) {
            int i = in.read(a);
            if (i != -1) {
                System.out.println("Количество = " + i + "\n  buff = " + Arrays.toString(a) + "\n строка = " + new String(a, 0, i ));
            }
            else {
                break;
            }
        }
    }


    public static void main(String[] args) throws IOException {
        String file = "Strings.txt";
        InputStream File = null;
        try {
            File = new FileInputStream(file);
            readAllByArray(File);
        } catch (IOException miss) {
            System.out.println("Ошибка файла: " + file + miss);
        } finally {
            if (File != null) {
                try {
                    File.close();
                } catch (IOException ignore) {
                }
            }
        }
    }
}