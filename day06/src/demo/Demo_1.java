package demo;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo_1 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("小皮", 34));
        students.add(new Student("小贾", 39));
        students.add(new Student("小爱", 32));

        for (Student student : students) {
            System.out.println(student);
        }

        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
