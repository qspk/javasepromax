package mygenericity;

/**
 * 自定义泛型类
 */
public class Test {
    public static void main(String[] args) {
        MyArrayList<String> mal = new MyArrayList<>();
        System.out.println(mal.add("qwer"));
        mal.add("wasd");
        mal.add("jkil");

        String s = mal.getByIndex(2);
        System.out.println(s);
    }
}

class MyArrayList<K> {
    private Object[] arr = new Object[10];

    private int index;

    public boolean add(K k) {
        arr[index] = k;
        index++;
        return true;
    }

    public K getByIndex(int index) {
        return (K) arr[index];
    }

}
