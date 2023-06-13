package regex;

import java.util.Scanner;

/**
 * 验证码: 长度6-16   包含:数字 字母 下划线
 * 正则表达式匹配
 */
public class MyRegex_2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("请输入验证码:");
            String phone = sc.next();
            boolean flag = phone.matches("\\w{6,16}");
            boolean flag1 = phone.matches("^\\{6,16}");  //匹配任意值
            if (flag) {
                System.out.println("验证码正确");
                break;
            } else {
                System.out.println("验证码错误");
            }
        }

    }
}
