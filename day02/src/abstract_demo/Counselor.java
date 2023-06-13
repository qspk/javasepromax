package abstract_demo;

public class Counselor extends Staff {
    private int number;

    @Override
    public void skill() {
        System.out.println("我完成了"+number+"人次的咨询");
    }

    public Counselor() {
    }
    public Counselor(String name, int age, int number) {
        super(name, age);
        this.number = number;
    }

    /**
     * 获取
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * 设置
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return "Counselor{number = " + number + "}";
    }
}
