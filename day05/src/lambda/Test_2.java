package lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 特定类型方法引用简化
 */
public class Test_2 {
    public static void main(String[] args) {
        String[] names = {"boby", "angela", "Andy", "dlei", "caocao", "Babo", "jack", "Cici"};

        // 要求忽略首字符大小写进行排序。
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 制定比较规则。o1 = "Andy"  o2 = "angela"
                return o1.compareToIgnoreCase(o2);
            }
        });

//        Arrays.sort(names, (o1, o2) -> o1.compareToIgnoreCase(o2));
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
