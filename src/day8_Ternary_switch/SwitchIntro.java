package day8_Ternary_switch;

public class SwitchIntro {

    public static void main(String[] args) {

        char grade = 'e';

        /*String result = "";

        result = (grade == 'A') ? "Excellent" : (grade == 'B') ? "Great Job" : (grade == 'C') ? "Good" : (grade == 'D') ? "Passed" : "Failed";
        System.out.println(result);

        System.out.println("------------------------------------------------");
        */

        switch (grade) {

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Great Job");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid");
        }

    }

}
