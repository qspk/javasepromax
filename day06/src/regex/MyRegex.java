package regex;

import java.util.Scanner;

/**
 * 手机号正则表达式匹配
 */
public class MyRegex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("请输入号码:");
            String phone = sc.next();
            boolean flag = phone.matches("(1[3-9]\\d{9})|(0\\d{2,9}-?[1-9]\\d{4,19})");
            if (flag) {
                System.out.println("号码格式正确");
                break;
            } else {
                System.out.println("格式错误");
            }
        }

    }
}
