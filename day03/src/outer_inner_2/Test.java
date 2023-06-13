package outer_inner_2;

public class Test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer.Inner();

        Outer o = new Outer();



        oi.test();
    }
}
