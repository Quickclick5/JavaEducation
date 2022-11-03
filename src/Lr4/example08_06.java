package Lr4;

import java.util.Random;
public class example08_06 {
    public static void main(String[] args) {
        Random random = new Random(100);
        int a = 3;
        int b = 3;
        int Array[][] = new int[a][b];
        for (int i = 0 ; i <a; i++) {
            for (int j = 0 ; j <b; j++) {
                Array[i][j] = random.nextInt(100);
                System.out.println("Индекс строки = "+i+";Индекс столбца = "+j+";Значение = "+Array[i][j]);
            }
        }
        System.out.println(" ");

        int KOL = random.nextInt(3);
        int STRK = random.nextInt(3);

        System.out.println("deleteS = "+(KOL)+";deleteK= "+(STRK));
        System.out.println(" ");

        int Cicl[][] = new int[a-1][b-1];
        for (int i=0, s = 0; i<a-1; s++) {
            if (s!=KOL){
                for (int j =0, k = 0 ; j <b-1; k++) {
                    if (k != STRK) {
                        Cicl[i][j] = Array[s][k];
                        System.out.println("i = " + i + ";j= " + j + ";Значение = " + Cicl[i][j]);
                        j++;
                    }
                }
                i++;
            }
        }
    }
}