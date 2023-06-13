package abstract_demo;

public abstract class Staff {
    private String name;
    private int age;

    //final 关键字修饰模版不让子类修改
    public final void introduction() {
        System.out.println("自我介绍");
        System.out.println("我叫: " + getName());
        System.out.println("我的年龄是: " + getAge());
        skill();
        System.out.println("结束");
    }

    public abstract void skill();


    public Staff() {
    }

    public Staff(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "People{name = " + name + ", age = " + age + "}";
    }
}
