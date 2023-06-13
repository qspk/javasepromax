package sort_1;

public class Student implements Comparable<Student>{
    private String name;
    private double height;
    private int age;


    @Override
    public String toString() {
        return "sort_2.Student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //默认按升序排列
        //this > o,返回正整数
        //this < o,返回负整数
        //this = o,返回0
        // 返回结果 x-1  即为降序排列
        return this.age - o.age;  //年龄升序
//        return -(this.age - o.age);  //年龄降序
    }

    public Student(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }
}
