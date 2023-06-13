package abstract_demo;

public class Test {
    public static void main(String[] args) {
        Staff p1 = new Teacher("李四", 32, "java");
        Staff p2 = new Counselor("王五", 23, 999);

        p1.introduction();
        p2.introduction();
    }
}
