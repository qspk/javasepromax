package myabstract;

public class Test2 {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.cry();

        Animal a2 = new Dog();
        a2.cry();
    }
}


class Dog extends Animal {
    {
        setName("狗");
    }
    @Override
    public void cry() {
        System.out.println("汪汪汪的叫");
    }
}

class Cat extends Animal {
    {
        setName("猫");
    }
    @Override
    public void cry() {
        System.out.println("喵喵喵的叫");
    }
}


abstract class Animal {
    private String name;

    public abstract void cry();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}