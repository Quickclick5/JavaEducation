package Lr3;
import java.util.Scanner;
import java.util.Random;

public class example08_09 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in );
        Random random = new Random();

        System.out.println("Введите размер массива, который будет заполен случайными числами:");
        int num = in.nextInt();
        int[] array  = new int[num];
        for (int j = 0; j < array.length; j++) {
            array[j] = random.nextInt(1000);}
        System.out.println("Массив будет иметь вид: ");
        for (int h : array)
        {
            System.out.println(h + "");}
          int MinValue = array[0];
          int MinIndex = 0;
          for (int i = 1; i < array.length; i++){
              if (array[i]< MinValue)
              {
                  MinValue = array[i];
                  MinIndex = i;
              }
            }
          System.out.println("Минимальное значение: " + MinValue);
          System.out.println("Минимальное индекс: " + MinIndex);


        }


    }

