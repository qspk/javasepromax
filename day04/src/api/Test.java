package api;

public class Test {
    public static void main(String[] args) {
        String s1 = "48";
        String s2 = "99";

        Integer integer = Integer.valueOf(s1);
        int i = Integer.parseInt(s2);
        System.out.println(i + 1);
        System.out.println(integer + 1);

        String s4 = String.valueOf(integer);
        String s5 = String.valueOf(i);
        System.out.println(s4 + 1);
        System.out.println(s5 + 1);


    }
}
