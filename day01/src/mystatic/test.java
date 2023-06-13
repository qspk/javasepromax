package mystatic;

public class test {
    public static int a;
    public int b;

    public test() {
    }

    public static void method() {
        test t = new test();
        t.b = 5;
        System.out.println(t.b);
//        System.out.println(b);  //错误无法直接调用
    }
}
