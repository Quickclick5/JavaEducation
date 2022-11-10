package Lr1;

import java.util.Scanner;

public class example08_11{
    

        public static void main(String[] args){

            Scanner in = new Scanner(System.in);
            System.out.print("Input Month: ");
            String month = in.nextLine();

            System.out.print("Number of days in a month: ");
            int days = in.nextInt();
            
         {System.out.printf("%s %d \n", month, days);}
            in.close();
        }
    }