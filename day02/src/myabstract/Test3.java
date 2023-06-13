package myabstract;

/**
 * 模版方法设计模式
 * 1、定义一个抽象类。
 * 2、在里面定义2个方法（一个是模板方法：把相同代码放里面去，一个是抽象方法：具体实现交给子类完成）。
 * 3、定义子类继承抽象类，重写抽象方法。
 * 4、创建子类对象，调用模板方法完成功能
 */
public class Test3 {
    public static void main(String[] args) {
        D d = new D();
        d.doSing();
    }
}

abstract class C{
    public void sing() {
        System.out.println("唱一首你喜欢的歌 ");

        doSing();

        System.out.println("唱完了!");
    }

    protected abstract void doSing();

}

class D extends C {

    @Override
    protected void doSing() {
        System.out.println("我是一只小小小鸟,想飞却飞不高  ");
    }
}