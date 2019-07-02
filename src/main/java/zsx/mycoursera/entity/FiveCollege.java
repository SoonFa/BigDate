package zsx.mycoursera.entity;/*
 *  create by Intellij IDEA
 *  @package name: zsx.mycoursera.entity
 *  @author: 赵思绣
 *  @description:
 *  @date: 30 20:41
 */

public class FiveCollege {
    private int id;
    private String college;
    private String year;
    private String number;

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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "FiveCollege{" +
                "id=" + id +
                ", college='" + college + '\'' +
                ", year='" + year + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
