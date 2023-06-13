package exception;

import java.util.Scanner;

/**
 * 自定义编译时异常
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入年龄");
            int age = sc.nextInt();
            try {
                checkAge(age);
                System.out.println("底层执行成功");
                break;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("底层执行失败");
            }
        }
    }

    //方法声明后 要throws异常
    private static void checkAge(int age) throws AgeIllegalException {
        if (age >= 0 && age <= 150) {
            System.out.println("年龄大小在范围内");
        } else {
            throw new AgeIllegalException("年龄大小超出范围! age= " + age);
        }
    }
}
