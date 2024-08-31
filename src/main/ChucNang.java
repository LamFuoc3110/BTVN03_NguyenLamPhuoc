package main;
import model.student;
public class ChucNang {
    public static void caculateBMI(student s){

        double weight = s.getWeight();
        double height = s.getHeight();
        double BMI = weight/Math.pow(height/100,2);
        System.out.println("BMI: "+BMI);
    }
    public static int parseStringtoInt(String str){

        return Integer.parseInt(str);
    }
}
