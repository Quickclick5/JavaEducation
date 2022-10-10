package lr1;

import java.util.Scanner;

public class example08_10{

        public static void main(String[] args){

            Scanner in = new Scanner(System.in);
            System.out.print("Input Weekday: ");
            String Weekday = in.nextLine();

            System.out.print("Input Month: ");
            String Month = in.nextLine();

            System.out.print("Input Date: ");
            int Date = in.nextInt();

            System.out.printf("Weekday: %s Month: %s Date: %d  \n", Weekday, Month, Date);
            in.close();
        }
}
