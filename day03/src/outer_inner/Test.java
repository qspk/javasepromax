package outer_inner;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner oi = outer.new Inner();
        Outer.Inner oi2 = new Outer().new Inner();

        oi.test();
        System.out.println("-------------------");
        oi2.test();


    }
}
