package Timus;
import java.util.Scanner;
public class timus_08_1224 {

    public static long Povorots(long N, long M) {

        if (N <= M) {
            return  4*(N/2) - 2*((N + 1) % 2);
        }

        return 4*(M/2) - 2*((M + 1) % 2) + 1;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        System.out.println(Povorots(N, M));

    }

}
