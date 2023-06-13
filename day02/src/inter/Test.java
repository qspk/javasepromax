package inter;

public class Test {
    public static void main(String[] args) {

    }
}

interface B {
    public static final String name = "黑马";

    public abstract void test();
}

interface A {

    public abstract void test();
}

class C implements B, A {

    @Override
    public void test() {
        System.out.println("实现A B接口的抽象方法");
    }
}
