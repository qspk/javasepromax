package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Collection  常用方法
 */
public class Test {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("aa");
        c.add("aa");
        c.add("bb");
        System.out.println(c);
/*
        c.clear();
        System.out.println(c);*/

        System.out.println(c.contains("aa"));
        c.remove("aa");
        System.out.println(c);

        System.out.println(c.isEmpty());
        System.out.println(c.size());

        Collection<String> c2 = new ArrayList<>();
        c2.add("cc");
        c2.addAll(c);
        System.out.println(c2);

        Object[] objects = c2.toArray();
        String [] arr = c2.toArray(new String[c2.size()]);
        System.out.println(Arrays.toString(arr));
    }
}
