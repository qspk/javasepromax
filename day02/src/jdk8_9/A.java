package jdk8_9;

import java.util.ArrayList;

public interface A{
    default void test1() {
        System.out.println("===默认方法===");
//        test2();
    }

    //JDK9 才支持
/*    private void test2() {
        System.out.println("===私有方法===");
    }*/

    static void test3() {
        System.out.println("===静态方法===");
    }
}
