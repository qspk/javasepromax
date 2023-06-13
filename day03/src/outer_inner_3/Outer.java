package outer_inner_3;

public class Outer {

    //私有内部类 外界无法直接访问
    private class Cpu {
        public void show() {
            System.out.println("I5-13000kf,$1000");
        }
    }
    //提供方法调用 私有内部类
    public void method() {
        Cpu cpu = new Cpu();
        cpu.show();
    }
}

class Test {
    public static void main(String[] args) {
        new Outer().method();

    }
}
