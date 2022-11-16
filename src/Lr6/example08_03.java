package Lr6;
public class example08_03 {
    public static void main(String[] args) {

        System.out.println("Вычисляем данные из массива: ");
        int[] i = new int[]{8,21,22,123,145,756,805,1077,1600,1992};
        System.out.print("Maximum: ");
        program.MethodMax(i);
        System.out.print("Minimum: ");
        program.MethodMin(i);
        System.out.print("Medium: ");
        program.MethodMed(i);
    }
    static class program {
        static void MethodMax(int ...num) {
            int[] nums = num;
            int tmp = 0;
            for (int i = 0; i < nums.length; i++) {
                if (tmp < nums[i]) {
                    tmp = nums[i];
                }
            }
            System.out.println(tmp);
        }
        static void MethodMin(int... num) {
            int[] nums = num;
            int tmp = 2147483647;
            for (int i = 0; i < nums.length; i++) {
                if (tmp > nums[i]) {
                    tmp = nums[i];
                }
            }
            System.out.println(tmp);
        }
        static void MethodMed(int... num) {
            int[] nums = num;
            double tmp = 0;
            for (int i = 0; i < nums.length; i++) {
                tmp += nums[i];
            }
            tmp = tmp / nums.length;
            System.out.println(tmp);
        }
    }
}


