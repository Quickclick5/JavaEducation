package Lr5;
import java.util.Scanner;
public class example08_03 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите 1 число");
        int int1 = id.nextInt();
        System.out.println("Введите 2 число");
        int int2 = id.nextInt();
        Example myexample1 = new Example();
        Example myexample2 = new Example(int1);
        Example myexample3 = new Example(int1,int2);
    }
    static class Example {

        private int num1;
        private int num2;


        Example(){
            System.out.println("Koнcтpyктор объекта 1 "+ "\n");
        }

        Example(int num1){
            System.out.println("Koнcтpyктор объекта 2");
            this.num1 = num1;
            System.out.println("Число1 * число1= "+summs (num1)+"\n");
        }
        public int summs (int num1) {
            this.num1 = num1;
            int result=0;
            for (int i=1; i <= num1;i++) {
                result = num1+result;
            }
            return result;
        }

        Example(int num1, int num2){
            System.out.println("Koнcтpyктор объекта 3");
            this.num1 = num1;
            this.num2 = num2;
            System.out.println("Число1 * число2 = "+exponentPow (num1,num2)+"\n");
        }
        public int exponentPow(int num1, int num2){

            int result=0;
            for (int i=1; i <= num2;i++) {
                result = num1+result;
            }
            return result;
        }
    }
}
