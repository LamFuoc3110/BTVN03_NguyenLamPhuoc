package model;

public class student {
    public student(String ID, String studentName, String dateOfBirth, String classes, double weight, double height, int age) {
        this.ID = ID;
        this.dateOfBirth = dateOfBirth;
        this.classes = classes;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }
    private String ID;
    private String dateOfBirth;
    private String classes;
    private double weight;
    private double height;
    private int age;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    String printValue(int age) { return "Tuoi la "+age;}
    String printValue(int age, String name) {return name+": "+age;}

    @Override
    public String toString() {
        return "student{" +
                "ID='" + ID + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classes='" + classes + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
