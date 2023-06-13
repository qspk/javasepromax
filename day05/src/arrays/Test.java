package arrays;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class Test {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 3, 5, 8, 3};
        System.out.println(Arrays.toString(arr));

        int[] arr2 = Arrays.copyOfRange(arr, 1, 3);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = Arrays.copyOf(arr, 10);
        int[] arr4 = Arrays.copyOf(arr, 4);
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

        Arrays.setAll(arr, new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return arr[operand] + 5;
            }
        });

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
