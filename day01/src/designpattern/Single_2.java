package designpattern;

/**
 * 恶汉单例模式
 *  在获取对象时才开始创建对象
 */
public class Single_2 {
    //2.创建一个私有类变量,但不创建新对象
    private static Single_2 s;


    //1.必须私有化构造方法
    private Single_2() {

    }

    //3.创建一个public 类方法,调用该方法时创建对象
    public static Single_2 getS() {
        if (s == null) {
            s = new Single_2();
        }
        return s;
    }
}
