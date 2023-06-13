package mystatic;

/**
 * static 修饰符
 *  修饰? 类变量:实例变量
 */
public class Demo1 {
    public static void main(String[] args) {
        Student.age = 20;
        System.out.println(Student.age);

        Student s1 = new Student();
        s1.name = "lisi";
        s1.age = 10;
        System.out.println(Student.age);

        Student s2 = new Student();
        System.out.println(s2.age);
    }
}
