package Lr1;

import java.util.Scanner;

public class example08_15 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("The first number: ");
        int x = in.nextInt();

        System.out.print("The second number: ");
        int y = in.nextInt();

        System.out.printf("Summ result: %d \n",(x + y));
    }
}