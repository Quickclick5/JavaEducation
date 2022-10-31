package Lr3;

public class example08_07 {
    public static void main(String[] args) {

        char Symbol = 'a';
        int Elements = 10;
        char [] Array = new char [Elements];
        for (int x=0; x<Elements; x++) {
            Array[x] = Symbol;
            Symbol = (char) (Symbol + 2);
        }
        System.out.print("Вывод массива в прямом порядке: ");
        for (char j : Array) System.out.print(j + " ");

        System.out.println(" ");

        System.out.print("Вывод массива в обратном порядке: ");
        for (int k = Elements - 1; k>=0; k--)

        System.out.print(Array[k] + " ");
        }


}

