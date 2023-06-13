package sort_2;

public class Student {
    private String name;
    private double height;
    private int age;

    public Student() {
    }


    @Override
    public String toString() {
        return "sort_2.Student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }

/*
    @Override
    public int compareTo(sort_2.Student o) {
        //默认按升序排列
        //this > o,返回正整数
        //this < o,返回负整数
        //this = o,返回0
        // 返回结果 x-1  即为降序排列
        return this.age - o.age;  //年龄升序
//        return -(this.age - o.age);  //年龄降序
    }
*/

    public Student(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }
}
