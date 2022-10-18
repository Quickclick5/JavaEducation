package Lr2;

import java.util.Scanner;

public class example08_03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число, для проверки на удовлетворение критериям: - (число делится на 4, и при этом оно не меньше 10) ");
        int x = in.nextInt();

        if (x % 4 == 0 & x > 10 ) System.out.println("Введенное вами число удовлетворяет критериям");
        else System.out.println("Введенное вами число не удовлетворяет критериям");
    }

}
