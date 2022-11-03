package Lr4;
import java.util.Scanner;
public class example08_07 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("введите количество строк массива: ");
        int a =id.nextInt();
        System.out.print("введите количество столбцов массива: ");
        int b = id.nextInt();
        int[][] Array = new int[a][b];
        int k = 0;
        int t = 0;
        int h = 0;
        for (int i = 0; h < Array.length ; h++) {
            for (int j = 0; j <(Array[i].length - k); j++) {
                Array[i][j] = t;
                t++;
            }
            if(i< Array.length-1) {
                i++;}
            for (int o=a-1; o > k; o--) {
                Array[o][Array[i].length-1-k] = t;
                t++;
            }
            k++;
        }

        for (int i = 0; i < Array.length; i++){

            System.out.println( "  ");
            for (int j = 0; j < Array[i].length; j++){
                System.out.print(Array[i][j]+" ");

            }

        }
    }
}