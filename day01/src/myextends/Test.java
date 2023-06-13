package myextends;

public class Test {
    public static void main(String[] args) {
        Zi_1 z = new Zi_1();
        z.print();
        z.method3();
        z.num = 10;
        int num = z.num;
        System.out.println(num);
        z.method5();
    }

}

class Fu_1 extends Ye_1 {
    public int i = 1;

    public void print() {
        System.out.println("---public-method");

    }

    private int j = 0;
    private void method2() {
        System.out.println("---private-method");
    }


}

class Zi_1 extends Fu_1 {
    public void method3() {
        System.out.println(i);
        print();
        System.out.println(num);
        //私有成员无法继承使用
        /*method2();
        System.out.println(j);
        */
    }

    public void method4() {
        System.out.println(num);
    }
}

class Ye_1 {
    public int num = 0;

    public void method5() {
        System.out.println("---Ye-public-method5");
    }
}
