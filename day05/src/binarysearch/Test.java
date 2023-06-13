package binarysearch;

import sort_test.Select_Sort;

public class Test {
    public static void main(String[] args) {
        int[] arr = {4, 2, 45, 76, 456, 3, 8, 9, 5};

        Select_Sort.select(arr);
        System.out.println(binarySearch(arr, 2));
    }

    public static int binarySearch(int[] arr,int date) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (arr[mid] < date) {
                left = mid + 1;
            } else if (arr[mid] > date) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
