import java.util.Arrays;
import java.util.Scanner;

public class Lesson6_1 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 45, 68};
        int[] array2 = new int[]{78, 98, 106};
        System.out.println(Arrays.toString(method(array1, array2)));
    }

    public static int[] method(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
                for (int i = array1.length, j = 0; i < array3.length; i++, j++) {
            array3[i] = array2[j];
        }
                return array3;
    }}



