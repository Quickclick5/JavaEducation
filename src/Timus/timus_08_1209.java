package Timus;

import java.util.Scanner;
import java.util.StringJoiner;


public class timus_08_1209 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        StringJoiner result = new StringJoiner(" ");

        while (N > 0) {
            int Enters = in.nextInt();
            double count = Math.sqrt(8*Enters-7);
            if (count % 1 == 0)
                result.add("1");
            else
                result.add("0");
            N--;
        }
        in.close();

        System.out.println(result);
    }
}
