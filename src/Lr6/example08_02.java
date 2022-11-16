package Lr6;

public class example08_02 {
    public static void main(String[] args) {
        NoName Dra = new NoName();
        for (int i = 0; i<30; i++){
            System.out.println(Dra.getNoName());
        }


    }
    static class NoName{
        private static int num = 0;

        static int getNoName(){

            num++;
            System.out.print("число = ");
            return num;
        }
    }
}
