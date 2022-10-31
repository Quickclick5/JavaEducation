package Lr3;

import java.util.Scanner;

public class example08_05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите два числа: ");
        int x = in.nextInt();
        int y = in.nextInt();

        if (x % 5 == 2 || y % 3 == 1) System.out.println(x + " " + y);
           else System.out.println("Не удовлетворяет услоиям ");

    int sum = x + y;
        System.out.println("Значение суммы равно: " + sum);
    }

}