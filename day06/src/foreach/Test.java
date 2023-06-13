package foreach;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * foreach 遍历
 */
public class Test {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("赵敏");
        c.add("小昭");
        c.add("素素");
        c.add("灭绝");

        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        c.forEach(s -> System.out.println(s));
        c.forEach(System.out::println);
    }
}
