package myextends2;

public class Teacher extends People{
    private String skill;

    public Teacher() {
    }

    public Teacher(String skill) {
        this.skill = skill;
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
