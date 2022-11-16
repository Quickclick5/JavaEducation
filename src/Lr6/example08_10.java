package Lr6;

public class example08_10 {
    public static void main(String[] args) {
        int[] x = new int[]{35,454,221,1182,2};

        System.out.println("min & max соотвтественно: ");
        x = Lupa.go(x);
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+"  ");
        }
    }
    static class Lupa{
        static int[] go(int ... nums){
            int[] s = nums;
            int[] num = new int[2];
            int max = 0, min = 3;
            for (int i=0;i<s.length;i++){
                if (max<s[i]){
                    max=s[i];
                }
                if (min>s[i]){
                    min=s[i];
                }
            }
            num[0]=min;
            num[1]=max;
            return num;
        }
    }
}
