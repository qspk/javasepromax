package api;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

        String str = reverse(line);
        System.out.println(str);
    }

    private static String reverse(String line) {
        return new StringBuilder(line).reverse().toString();
    }
}
