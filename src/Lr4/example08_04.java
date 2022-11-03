package Lr4;

public class example08_04 {

    public static void main(String[] args) {

        int figure = 10; // число строк которое необходимо вывести
        int i; // переменная задает число, необходимое для расчета количества строк
        int j; // переменная задает число, необходимое для расчета количества колонок (символов в строке)

        for ( i = 1; i <= figure; i++) {
            for ( j = 1; j <= i; j++) {
               System.out.print("*");
            }
System.out.println(" ");
        }
    }
}


