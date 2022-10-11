package lr1;

import java.util.Scanner;

public class example08_09{



    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Input Month: ");
        String Month = in.nextLine();

        System.out.print("Input Date: ");
        int Date = in.nextInt();

        System.out.printf(" Month: %s Date: %d  \n",  Month, Date);
        in.close();
    }
}
