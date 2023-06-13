package api;

/**
 * StringBuilder
 */
public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("aaa");

        sb1.append(sb2);
        System.out.println(sb1);
        sb1.append(24);
        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);
        sb1.replace(0, 2, "bbb");
        System.out.println(sb1);

        String s = sb1.toString();
        System.out.println(s);

        System.out.println(sb2.length());
    }
}
