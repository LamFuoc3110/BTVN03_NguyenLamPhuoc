package model;

public class teacher {
    private String ID;
    private String teacherName;
    private String major;
    private int age;

    public teacher(String ID, String teacherName, String major, int age) {
        this.ID = ID;
        this.teacherName = teacherName;
        this.major = major;
        this.age = age;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
