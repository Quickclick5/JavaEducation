package Lr3;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class example08_10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива, который будет заполен случайными числами:");
        int num = in.nextInt();
        Integer[] array = new Integer[num];
        for (int j = 0; j < array.length; j++) {
            array[j] = random.nextInt(1000);
        }
        System.out.println("Массив будет иметь вид до сортировки: ");
        for (int h : array) System.out.print(h + " ");
        System.out.println(" ");
        System.out.println("Массив будет иметь вид после сортировки: ");
        Arrays.sort(array, Collections.reverseOrder());
        for (int values : array) {
            System.out.print(values + " ");
        }
    }
}