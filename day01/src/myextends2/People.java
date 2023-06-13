package myextends2;

public class People {
    private String name;


    public People() {
    }

    public People(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "People{name = " + name + "}";
    }
}
