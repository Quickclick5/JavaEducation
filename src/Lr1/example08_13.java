package Lr1;

import java.util.Scanner;

public class example08_13 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = in.nextLine();

        System.out.print("Your year of birth: ");
        int yearbirth = in.nextInt();

        System.out.print("Year now: ");
        int yearnow = in.nextInt();

        System.out.printf("%s %d years\n",name, (yearnow - yearbirth));
    }
}
