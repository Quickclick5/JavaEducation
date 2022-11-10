package Lr1;

import java.util.Scanner;

public class example08_16 {

    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("Enter number: ");
    int x = in.nextInt();

    System.out.printf("result: %d %d %d %d\n",(x + 1),(x - 1),(x),(x * x));
}
}
