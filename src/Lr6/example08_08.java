package Lr6;

public class example08_08 {

        public static void main(String[] args) {
            int[] x = new int[]{546,75,9848,48,600};
            System.out.print("Среднее значение элементов в массиве = "+Medium.program(x));
        }
        static class Medium{
            static double program(int[] nums){
                double result=0;
                for (int i=0; i< nums.length;i++){
                    result+=nums[i];
                }
                result/=nums.length;
                return result;
            }
        }
}
