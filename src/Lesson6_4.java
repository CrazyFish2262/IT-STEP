
import java.util.Arrays;

public class Lesson6_4 {
    public static void main(String[] args) {
        int a = 7;
        String shape = "квадрат";

        System.out.println(square(a, shape));

    }

    public static double square(int b, String x) {
        switch (x) {
            case "круг":
                return circle(b);

            case "квадрат":
                return square(b);

        }
        return 0;
    }

    public static double circle(int a) {
        double x = 0;
        x = Math.PI * a * a;
        return x;
    }

    public static int square(int a) {
        int x = 0;
        x = a * a;
        return x;
    }


}



