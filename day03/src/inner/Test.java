package inner;

/**
 * 匿名内部类
 */
public class Test {
    public static void main(String[] args) {
        new Animal(){

            @Override
            void cry() {
                System.out.println("喵喵喵");
            }
        }.cry();
    }
}

abstract class Animal {
    abstract void cry();
}