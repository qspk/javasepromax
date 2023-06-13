package mystatic3;

public class Student {
    static String schoolName;   //类变量
    double score;   //实例变量

    //1.类方法中可以直接访问类的成员,不可以直接访问实例成员
    public static void printHelloWorld(){
        //注: 同一个类中,访问成员,可以省略不写
        schoolName = "黑马";
        printHelloWorld2();

//        System.out.println(score);  //报错
//        printPass(); //报错
    }
    //类方法
    public static void printHelloWorld2() {

    }

    //实例方法
    public void printPass2() {

    }

    //实例方法
    //2.实例方法中既可以直接访问类成员,也可以直接访问实例成员
    //3.实例方法中可以出现this关键字, 类方法中中不可以
    public void printPass() {
        schoolName = "黑马";
        printHelloWorld2();

        System.out.println(score);
        printPass2();

        System.out.println(this);
    }


}
