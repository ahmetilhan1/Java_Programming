package day7_ifstatements;

public class GradeReport {

    public static void main(String[] args) {

        int gradeLevel = 6;

        String result = "";

        if (gradeLevel<6){
            result = "Elemantary School";
        }else if (gradeLevel<9){
            result = "Middle School";
        }else if (gradeLevel<13){
            result = "High School";
        }else if (gradeLevel<17){
            result = "College";
        }else {
            result = "Grad School";
        }
        System.out.println("Grade Of Person = "+result);

    }
}
