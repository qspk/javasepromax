package mysuper;

/**
 *  子类的所有构造器都会先执行父类的构造器,默认为super()无参构造器,
 *  可在()内添加参数,调用对应的有参构造器
 */

class F{
    {
        System.out.println("父类构造器已执行");
    }
    public F(String name) {
        this.name = name;
    }

    public F() {
    }

    private String name;
}

class Z extends F{
    private int age;

    public Z(int age) {
        this.age = age;
    }

    public Z() {
    }

    public Z(String name, int age) {
        super(name);
        this.age = age;
    }
}


public class Test1 {
    public static void main(String[] args) {
        Z z1 = new Z();
        Z z2 = new Z(4);
        Z z3 = new Z("aa",34);
    }
}
