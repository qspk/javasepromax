package inter_demo;

public class StudentOperatorFactory {
    static StudentOperator getStudentOperator() {
        return new StudentOperatorImpl2();
    }
}
