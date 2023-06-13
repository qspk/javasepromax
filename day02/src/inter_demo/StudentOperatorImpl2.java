package inter_demo;

import java.util.ArrayList;

public class StudentOperatorImpl2 implements StudentOperator {
    @Override
    public void printAllInfo(ArrayList<Student> students) {
        //打印所有学生信息 以及男女生人数和总人数
        int count1 = 0;  //男生人数
        int count2 = 0;  //女生人数
        for (Student student : students) {
            System.out.println("姓名: " + student.getName() + "性别: " + student.getSex() + "分数: " + student.getScore());
            if (student.getSex() == '男') {
                count1++;
            } else if (student.getSex() == '女') {
                count2++;
            }
        }
        System.out.println("男生人数:" + count1);
        System.out.println("女生人数:" + count1);
        System.out.println("总人数:" + students.size());
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        //打印平均成绩 去除最低分和最高分
        double sum = 0;
        double max = students.get(0).getScore();
        double min = students.get(0).getScore();
        for (Student student : students) {
            sum += student.getScore();
            if (student.getScore() > max) {
                max = student.getScore();
            }
            if (student.getScore() < min) {
                min = student.getScore();
            }
        }
        System.out.println("最高分: " + max);
        System.out.println("最低分: " + min);
        System.out.println("平均成绩: " + sum / students.size());
    }
}
