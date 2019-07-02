package zsx.mycoursera.entity;

public class ComputerNumber {
    private int id;
    private String classname;
    private String number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ComputerNumber{" +
                "id=" + id +
                ", classname='" + classname + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
