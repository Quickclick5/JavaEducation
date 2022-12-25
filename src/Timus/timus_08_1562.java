package Timus;
import java.util.Scanner;
import static java.lang.Math.*;

public class timus_08_1562 {


    public static double pieceSize(double x1, double x2, double x3, double x4) {
        return PI*pow(x4, 2)*((x2 - x1) + 1/(3.0*pow(x3, 2))*(pow(x1, 3) - pow(x2, 3)));
    }

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();
        int    n = in.nextInt();

        double dx = b/n;
        double x  = -b/2 + dx;
        while (x <= b/2 + 0.000001) {
            System.out.printf("%.6f\n", pieceSize(x - dx, x, b/2, a/2));
            x += dx;
        }

        in.close();

    }

}