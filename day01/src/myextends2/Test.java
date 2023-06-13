package myextends2;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setSkill("java,c++");
        t.setName("波仔");
        System.out.println(t.getSkill());
        System.out.println(t.getName());
        System.out.println(t);

        Counselor c = new Counselor();
        c.setNumber(9999);
        System.out.println(c.getNumber());
    }
}
