package lr3;
import java.util.Scanner;

public class example08_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число min и max: ");
        int min = in.nextInt();
        int max = in.nextInt();

        System.out.println("Используем оператор цикла for: ");
        if (min < max)
            for (int x = min; x <= max; x++) System.out.println(x + "  ");
        else if (min > max) {
            for (int x = min; x <= max; x++) System.out.println(x + "  ");
        }
        else System.out.println(max);

        System.out.println("Использем оператор цикла while: ");
        int j = Math.abs(min - max);
        int k = Math.min(min, max);
        while(j-->= 0) {
            System.out.println(k + "  ");
            k++;
        }
    }
}