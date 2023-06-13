package inter_demo;

import java.util.ArrayList;

public class StudentOperatorImpl1 implements StudentOperator{
    @Override
    public void printAllInfo(ArrayList<Student> students) {
        //打印所有学生信息
        for (Student student : students) {
            System.out.println("姓名: " + student.getName() + "性别: " + student.getSex() + "分数: " + student.getScore());
        }
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        //打印平均成绩
        double sum = 0;
        for (Student student : students) {
            sum += student.getScore();
        }
        System.out.println("平均成绩: " + sum / students.size());
    }
}
