package lr1;

import java.util.Scanner;

public class example08_14 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Your age: ");
        int age = in.nextInt();

        System.out.print("Year now: ");
        int yearnow = in.nextInt();

        System.out.printf("Your year of birth: %d \n",(yearnow - age));
    }
}

