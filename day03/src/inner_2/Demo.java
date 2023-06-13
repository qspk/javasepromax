package inner_2;

public class Demo {
    public static void main(String[] args) {
        Swimming s = new Swimming() {
            @Override
            public void swim() {
                System.out.println("狗刨飞快");
            }
        };
        s.swim();
        goSwimming(s);
        Swimming s2 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("猴子也还行");
            }
        };
        s2.swim();
        goSwimming(s2);
    }

    public static void goSwimming(Swimming s) {
        s.swim();
    }


}

interface Swimming {
    void swim();
}
