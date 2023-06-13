package polymorphic;

/**
 * 多态前提: 1)有继承实现关系;2)存在父类引用指向子类对象;3)有方法重写
 * <p>
 * 注意事项: 多态是对象、行为的多态，Java中的属性（成员变量）不谈多态
 */

public class Test1 {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Dog();
        a1.method();
        a2.method();
    }
}

class Cat extends Animal {
    @Override
    public void method() {
        System.out.println("喵喵喵喵喵喵");
    }
}

class Dog extends Animal {
    @Override
    public void method() {
        System.out.println("汪汪汪汪汪");
    }
}

class Animal {
    String name;
    int age;

    public void method() {
        System.out.println("叫声");
    }


}