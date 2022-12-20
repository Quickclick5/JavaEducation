package Timus;

import java.util.Scanner;

public class timus_08_2012 {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            int NumberOfTasks = in.nextInt();

            int difference = 12 - NumberOfTasks;

            int time = difference * 45;

            if(time <=240){
                System.out.println("YES");
            }
            else{ System.out.println("NO");

            }


    }
}
