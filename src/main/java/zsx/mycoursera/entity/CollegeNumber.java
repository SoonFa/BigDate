package zsx.mycoursera.entity;/*
 *  create by Intellij IDEA
 *  @package name: zsx.mycoursera.entity
 *  @author: 赵思绣
 *  @description:
 *  @date: 30 17:42
 */

public class CollegeNumber {
    private int id;
    private String college;
    private String value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CollegeNumber{" +
                "id=" + id +
                ", college='" + college + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
