package Timus;


import java.util.Scanner;

public class timus_08_1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int NumberOfM = m + 1;

        int result = n * NumberOfM;
        System.out.println(result);
    }
}