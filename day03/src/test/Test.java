package test;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        boolean b = true;
        sb.append(b);
        sb.append(false);
        System.out.println(sb.toString());
    }
}
