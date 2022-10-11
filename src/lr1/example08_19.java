package lr1;

public class example08_19 {

        public static void main(String[] args) {
            double a = 10.0, b = 4.0;
            System.out.println("hypotenuse c: " + hyp(a, b));
        }
        private static double hyp(double cath1, double cath2) {
            return Math.sqrt(customDegree(cath1, 2) + customDegree(cath2, 2));
        }
        private static double customDegree(double x, double y) {
            return Math.exp(y * Math.log(x));
        }
        private static double standartDegree(double x, double y) {
            return Math.pow(x, y);
        }
    }

