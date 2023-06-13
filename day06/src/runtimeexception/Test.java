package runtimeexception;

import java.util.Scanner;

/**
 * 自定义运行时异常
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入年龄");
            int age = sc.nextInt(); try {
                checkAge(age);
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void checkAge(int age) {
        if (age >= 0 && age <= 150) {
            System.out.println("年龄大小在范围内");
        } else {
            throw new AgeIllegalRunTimeException("年龄大小超出范围! age= " + age);
        }
    }
}
