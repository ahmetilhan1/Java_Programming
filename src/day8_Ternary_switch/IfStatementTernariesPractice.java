package day8_Ternary_switch;

public class IfStatementTernariesPractice {

    public static void main(String[] args) {

        int score = 90;

        String result = "";

        if(score>= 0 && score<=100){

            result = (score>=90)? "A": (score>=80)? "B": (score>=70)? "C": (score>=60)? "D": "F";

        }else{
            result = "Invalid Score";
        }
        System.out.println("Grade of the Student= "+result);
    }
}
