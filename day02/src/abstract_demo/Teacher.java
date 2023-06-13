package abstract_demo;

public class Teacher extends Staff {
    private String skill;

    public Teacher() {
    }

    public Teacher(String name, int age, String skill) {
        super(name, age);
        this.skill = skill;
    }

    @Override
    public void skill() {
        System.out.println("我会: "+ getSkill());
    }

    /**
     * 获取
     * @return skill
     */
    public String getSkill() {
        return skill;
    }

    /**
     * 设置
     * @param skill
     */
    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String toString() {
        return "Teacher{skill = " + skill + "}";
    }
}
