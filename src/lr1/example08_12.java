package Lr1;

import java.util.Scanner;

public class example08_12{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Your year of birth: ");
        int birthyear = in.nextInt();

        System.out.print("Year now: ");
        int yearnow = in.nextInt();

        System.out.printf("Your age: %d \n",(yearnow - birthyear));
    }
}