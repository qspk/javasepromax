package outer_inner_2;

public class Outer {
    private int age;
    private static String name;

    //静态内部类
    public static class Inner {

        int age0;
        public void test() {
//            System.out.println(age);  //无法访问使用外部类实例变量
            System.out.println(age0);
            System.out.println(name);

        }
    }

}
