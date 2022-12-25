package Timus;

import java.util.Scanner;

public class timus_08_1083 {

        static Scanner in = new Scanner(System.in);

        public static void main(String[] args) {

            int numb = in.nextInt();
            String S = in.next();

            int howManyS = 0;

            char[] S_Char = S.toCharArray();
            for (char c : S_Char) {
                howManyS++;
            }

            int k = 1;
            for (int i = numb; i > 0; i = i - howManyS) {
                k = k* (numb);
                numb -= howManyS;
            }

            System.out.println(k);

        }
    }

