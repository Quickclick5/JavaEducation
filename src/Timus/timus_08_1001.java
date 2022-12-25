package Timus;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;


public class timus_08_1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Long> deque = new LinkedList<>();

        while (in.hasNextLong())
            deque.addFirst(in.nextLong());

        for (Long k : deque)
            System.out.printf("%.4f\n", Math.sqrt(k));
    }
}