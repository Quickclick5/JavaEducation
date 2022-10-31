package Lr3;

import java.util.Scanner;

public class example08_06 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");

        int EnterNum = in.nextInt();
        if (EnterNum > 0) {
            int[] x = new int[EnterNum];
            int Base = 2;
            for
            (int num = 0; num < EnterNum; num++) {
                x[num] = Base;
                Base = Base + 5;
            }
            for (int i : x) System.out.print(i + " ");
        }
        else System.out.println("Значение не корректно ");
    }
}

