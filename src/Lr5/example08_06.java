package Lr5;

public class example08_06 {
    public static void main(String[] args) {

        Example example1 = new Example(10, 100);
        example1.PrintInt();

        Example example2 = new Example(15);
        example2.PrintInt();

        example1.SetInt(6, 16);
        example1.PrintInt();

        example1.SetInt(-100);
        example1.PrintInt();
    }

    static private class Example {
          static int min;
          static int max;


        static void SetInt(int num1, int num2) {
            System.out.println("Метод c 2-я аргументами");
            min = Math.min(Math.min(num1, min), num2);
            max = Math.max(Math.max(num1, max), num2);
        }

        static void SetInt(int num) {
            System.out.println("Метод c 1-м аргументом");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        static void PrintInt() {
            System.out.println("min = " + min);
            System.out.println("max = " + max);
        }

        Example(int num1, int num2) {
            System.out.println("Конструктор c 2-я аргументами");
            min = Math.min(num1, num2);
            max = Math.max(num1, num2);
        }

        Example(int num) {
            System.out.println("Конструктор c 1-м аргументом");
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
    }
}