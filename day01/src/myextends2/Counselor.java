package myextends2;

//咨询师类
public class Counselor extends People{
    private int number;

    public Counselor() {
    }

    public Counselor(int number) {
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
        return "counselor{number = " + number + "}";
    }
}
