package polymorphic;




public class Test2 {
    public static void main(String[] args) {
        go(new Teacher());
        go(new Student());
    }

    public static void go(People people) {
        System.out.println("开始---------------------");
        people.run();
        if (people instanceof Teacher) {
            Teacher t = (Teacher) people;
        } else if (people instanceof Student) {
            Student student = (Student) people;
            student.study();
        }
        System.out.println("结束---------------------");
    }
}

class People{
    String name;
    public void run() {
        System.out.println("跑步");

    }
}

class Student extends People {
    String name = "学生";

    @Override
    public void run() {
        System.out.println("学生跑得飞快");
    }

    public void study() {
        System.out.println("学的很棒");
    }
}

class Teacher extends People {
    String name = "老师";

    @Override
    public void run() {
        System.out.println("老师跑得慢");

    }

    public void teach() {
        System.out.println("教的很仔细");
    }
}