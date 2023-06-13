package outer_inner_4;

public class Outer {

    //静态内部类静态方法
    public static class Inner {
        public static void show() {
            System.out.println("静态内部类静态方法");
        }
    }

}

class Test {
    public static void main(String[] args) {
        Outer.Inner.show();  //类名直接调用
    }
}