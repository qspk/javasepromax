package regex;

import java.util.Scanner;

/**
 * 邮箱验证
 * 正则表达式匹配
 */
public class MyRegex_3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("请输入邮箱:");
            String phone = sc.next();
            boolean flag = phone.matches("\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2}");
            if (flag) {
                System.out.println("邮箱正确");
                break;
            } else {
                System.out.println("邮箱错误");
            }
        }

    }
}
