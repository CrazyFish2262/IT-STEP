import java.util.Arrays;

public class Lesson6_2 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 45, 68};
        int[] array2 = new int[]{78, 98, 106};
        int[] array3 = new int[]{78, 98, 106};
        System.out.println(method(array3));

    }

    public static int method(int[] array1) {
        int arraySum = 0;
        for (int i = 0; i < array1.length; i++) {
            arraySum += array1[i];
        }
        return arraySum;
    }
}


