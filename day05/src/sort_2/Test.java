package sort_2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("蜘蛛精", 169.5, 23);
        students[1] = new Student("紫霞", 163.8, 26);
        students[2] = new Student("紫霞", 163.8, 26);
        students[3] = new Student("至尊宝", 167.5, 24);

//        Arrays.sort(students, (o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight()));
//        Arrays.sort(students, (o1, o2) -> CompareByData.compareByAge(o1, o2));
        Arrays.sort(students, CompareByData::compareByAge);  //静态方法引用

        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new CompareByData()::compareDesc);  //实例方法引用
        System.out.println(Arrays.toString(students));
        System.out.println(new Object(){
            @Override
            public String toString() {

                return null;
            }
        });

    }
}
