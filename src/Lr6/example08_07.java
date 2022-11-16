package Lr6;

public class example08_07 {
    public static void main(String[] args) {
        char[] test = new char[]{'F','{','|'};
        System.out.print("Коды символов F, {, | :  ");
        for (int i=0;i< test.length;i++){
            System.out.print(Pro.StaticMethod(test)[i] + ",  ");
        }
        System.out.print(" соответственно ");
    }
    static class Pro{
        static int[] StaticMethod(char[] ic){
            int[] arg = new int[ic.length];
            for (int i=0;i<arg.length;i++){
                arg[i]=ic[i];
            }
            return arg;
        }
    }
}
