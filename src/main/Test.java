package main;
import model.student;

public class Test {
    public static void main(String[] args){
        student student1 =  new student("123456","Nguyen Van A","12/3/1999","SE190000",45.5,160,19);
        student student2 = new student("135791","Nguyen Van B","23/04/2005","SE18000",50.5,170.5,20);
       // ChucNang.parseStringtoInt("123");
        ChucNang.caculateBMI(student1);
        System.out.println(student1.getAge());
        ChucNang.caculateBMI(student2);
        System.out.println("student2 : "+student2.getAge());
        student1.setAge(30);
        System.out.println("student1 : "+student1.getAge());


    }

}
