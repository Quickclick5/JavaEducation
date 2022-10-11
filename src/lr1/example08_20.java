package lr1;

import java.util.Scanner;

public class example08_20 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a: ");
            int a = in.nextInt();

            System.out.print("Enter b: ");
            int b = in.nextInt();

            double pow  = Math.pow(a,b);

            System.out.printf("Result: %s", pow);
        }
    }

