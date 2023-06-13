package runtime;

public class Test {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors());

        System.out.println(runtime.totalMemory() / 1024.0 / 1024.0 + "MB");
        System.out.println(runtime.freeMemory() / 1024.0 / 1024.0 + "MB");




    }
}
