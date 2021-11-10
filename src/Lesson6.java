import java.util.Random;
import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        System.out.println("Input your number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String s = answer(a);
        System.out.println(s);

    }

    public static String answer(int a) {
        if (a >= 0) {
            return "Positive";
        } else {
            return "Negative";
        }
    }


}