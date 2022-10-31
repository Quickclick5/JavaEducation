package Lr3;

import java.util.Scanner;

public class example08_03 {

    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("Введите количество чисел Фибонначи для вывода");
    int x = in.nextInt();


    System.out.println("Готовая последовательность:  ");
    int y = 1;
    int z;
    int o = 0;
       while (x--> 0) {
           System.out.print(y + " ");
           z = y;
           y = y + o;
           o = z;
        }
    }
}