package list;

import java.util.ArrayList;
import java.util.List;

/**
 *  List 集合特有方法
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("蜘蛛精");
        list.add("至尊宝");
        list.add("至尊宝");
        list.add("牛夫人");
        System.out.println(list); //[蜘蛛精, 至尊宝, 至尊宝, 牛夫人]

        list.add((2), "紫霞仙子");
        System.out.println(list.remove(3));
        System.out.println(list.get(3));
        System.out.println(list.set(3, "牛魔王"));
    }
}
