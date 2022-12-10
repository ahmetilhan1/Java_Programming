package day8_Ternary_switch;

public class TernaryIntro3 {

    public static void main(String[] args) {

        int score = 70;

      /*  String result = "";

        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                result = "passed";
            } else {
                result = "failed";
            }

        } else {
            result = "invalid";
        }

        System.out.println(result);

       */

        String result = (score>= 0 && score <=100)?
                (score>=60)? "Passed" : "Failed"
                : "Invalid Score";
        System.out.println(result);


        System.out.println("=========-------------------------------------");


        int n = 7;

        String day = (n>=1 && n<=7)?
                (n==1)? "Monday": (n==2)? "Tuesday": (n==3)? "Wednesday" : (n==4)? "Thursday":
                        (n==5)? "Friday" : (n==6)? "Saturday": "Sunday"
                :"invalid Day";
        System.out.println(day);


    }



}
