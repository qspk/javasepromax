package lambda;

public class Test {
    public static void main(String[] args) {
        useEat(()-> System.out.println("一天一个苹果"));

        useEat(() -> System.out.println("一天三个苹果"));

        Eat eat =()-> System.out.println("一天八个");

        eat.eat();

    }

    public static void useEat(Eat eat) {
        eat.eat();
    }
}

interface Eat {
    void eat();
}
