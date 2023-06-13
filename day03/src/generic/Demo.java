package generic;

import java.util.ArrayList;

/**
 * 接口泛型
 */
public class Demo {

}

interface Data<T> {
    void add(T t);

    ArrayList<T> getByName();
}

class StudentData implements Data<Student> {

    @Override
    public void add(Student student) {

    }

    @Override
    public ArrayList<Student> getByName() {
        return null;
    }
}

class TeacherData implements Data<Teacher> {

    @Override
    public void add(Teacher teacher) {

    }

    @Override
    public ArrayList<Teacher> getByName() {
        return null;
    }
}