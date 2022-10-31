package Lr3;

import java.util.Scanner;

public class example08_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число в диапозоне от 1 до 7: ");

        int x = in.nextInt();
        switch (x) {
            case 1 -> System.out.print ("Числу 1 соотвествует понедельник \n");
            case 2 -> System.out.print ("Числу 2 соотвествует вторник \n");
            case 3 -> System.out.print ("Числу 3 соотвествует среда \n");
            case 4 -> System.out.print ("Числу 4 соотвествует четверг \n");
            case 5 -> System.out.print ("Числу 5 соотвествует пятница \n");
            case 6 -> System.out.print ("Числу 6 соотвествует суббота \n");
            case 7 -> System.out.print ("Числу 7 соотвествует воскресение \n");
            default -> System.out.print ("Введено некорректное число (вне диапазона 1-7)");
        }
    }
}

