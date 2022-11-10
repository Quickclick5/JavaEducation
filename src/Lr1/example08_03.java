package Lr1;

public class example08_03 {

    public static void main(String[] args)
    {
        int S, D;
        S = 10;
        D = 20;
        if (S < D) System.out.printf("S < D S=%d D=%d \n", S,D);
        S = S * 2;
        if (S == D) System.out.printf("S = D S=%d D=%d \n", S,D);
        S = S * D;
        if(S > D) System.out.printf("S > D S=%d D=%d \n", S,D);
    }
}