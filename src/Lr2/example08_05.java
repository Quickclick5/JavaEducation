package Lr2;

import java.util.Scanner;

public class example08_05 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");

        int x = in.nextInt();
        int y = x / 1000;

        System.out.println("Во введенном вами числе " + y + " тысяч");
    }
}
