package api;

import java.util.StringJoiner;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {43, 12, 54, 74, 5, 53, 2, 53, 64, 3, 5, 25, 46, 45, 756, 74, 6, 3, 642, 64, 7, 547,};
        System.out.println(toString(arr));
        System.out.println(toString0(arr));
    }

    //整形数组拼接字符串
    public static String toString(int[] a) {
        if (a == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                sb.append(a[i]).append("]");
            } else {
                sb.append(a[i]).append(", ");
            }
        }
        return sb.toString();
    }

    public static String toString0(int[] a) {
        if (a == null) {
            return null;
        }
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i : a) {
            sj.add(String.valueOf(i));
        }

        return sj.toString();
    }
}
