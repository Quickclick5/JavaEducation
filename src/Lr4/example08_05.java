package Lr4;

import java.util.Random;

public class example08_05 {
    public static void main(String[] args) {
        Random random = new Random();
        int figure = 3; // число строк которое необходимо вывести
        int i; // переменная задает число, необходимое для расчета количества строк
        int j; // переменная задает число, необходимое для расчета количества колонок (символов в строке)
        int x = random.nextInt(100);
        System.out.println("Исходный случайный массив: ");
        for (i = 1; i <= figure; i++) {
            for (j = -2; j < figure; j++) {
                System.out.print(x + " ");
                x = random.nextInt(100);
            }
            System.out.println(" ");
        }
        System.out.println("Перевернутый исходный случайный массив: ");
            for (j = -1; j <= figure; j++) {
                for (i = 0; i < figure; i++) {
                    System.out.print(x + " ");
                    x = random.nextInt(100);
                }
                System.out.println(" ");
            }
    }
}
