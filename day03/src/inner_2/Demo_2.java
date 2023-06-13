package inner_2;

public class Demo_2 {
    public static void main(String[] args) {
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("一天一个苹果,医生远离我");
            }
        });

        useEatable(new EatableImpl());
    }

    private static void useEatable(Eatable eatable) {
        eatable.eat();
    }
}

interface Eatable {
    void eat();
}

class EatableImpl implements Eatable {
    @Override
    public void eat() {
        System.out.println("一天一个苹果");
    }
}