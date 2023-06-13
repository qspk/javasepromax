package sort_test;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class Bubble {
    public static void main(String[] args) {
        int[] arr = {3, 1, 66, 0, 44, 2, 6, 43, 6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
