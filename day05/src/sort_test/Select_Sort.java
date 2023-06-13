package sort_test;

import java.util.Arrays;

/**
 * 选择排序
 */
public class Select_Sort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 66, 0, 44, 2, 6, 43, 6};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void select(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
