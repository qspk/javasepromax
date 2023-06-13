package iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 迭代器 iterator
 */
public class Test {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("aa");
        c.add("bb");
        c.add("cc");

        Iterator<String> it = c.iterator();
        Iterator<String> it2 = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        while (it2.hasNext()) {
            it2.next();
            it2.remove();
        }

        System.out.println(c);

    }
}
