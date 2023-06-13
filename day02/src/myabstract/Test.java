package myabstract;

public class Test {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void method() {

            }
        };
    }
}

abstract class A {
    private String name;
    static String schoolName;

    public A() {

    }

    public abstract void method();

    public void method2() {

    }
}

class B extends A {

    @Override
    public void method() {
        System.out.println("实现抽象类A的抽象方法");
    }
}