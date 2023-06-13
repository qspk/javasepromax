package outer_inner;

public class Outer {
    private int age = 99;

    //成员内部类
    public class Inner{
        private int age = 88;

        //在内部类既可以访问自己类的成员, 也可以访问外部类的成员
        public void test() {
            System.out.println(age);  //88

            int age = 77;
            System.out.println(age);  //77
            System.out.println(this.age);   //88
            System.out.println(Inner.this.age);  //88
            System.out.println(Outer.this.age);  //99
        }
    }
}
