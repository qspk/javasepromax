package system;

public class Test {
    public static void main(String[] args) {
//        System.exit(0);

        long l = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            System.out.println("输出"+ i);
        }



        long l2 = System.currentTimeMillis();
        System.out.println((l2-l)/1000.0 +"s");
    }
}
