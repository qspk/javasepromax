package designpattern;

/**
 * 恶汉单例模式
 */
public class Single {
    //2.创建一个类变量来储存这个类的一个对象
    private static Single s = new Single();

    //1.私有化构造方法
    private Single() {
    }

    //3.创建一个类方法返回对象
    public static Single getSingle() {
        return s;
    }

}
