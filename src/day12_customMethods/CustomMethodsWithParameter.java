package day12_customMethods;

import java.util.Locale;
import java.util.Scanner;

public class CustomMethodsWithParameter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Give me a number");

        oddOrEven(input.nextInt());
        System.out.println("--------------------------");

        System.out.println("Whats your age?");

        age(input.nextInt());

        System.out.println("-------------------------");

        System.out.println("Whats your Grade?");

        grade(input.nextInt());

        initials();


    }


    public static void oddOrEven(int number) {

        if (number == 0) {
            System.out.println(number + " is zero");
        } else if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }

    public static void age(int age) {

        if (age >= 21) {
            System.out.println("Eligible to buy Alcohol");
        } else {
            System.out.println("Not eligible to buy Alcohol");
        }
    }

    public static void grade(int grade){

        if(grade>89 && grade<+100){
            System.out.println("Excellent");
        } else if (grade>79) {
            System.out.println("Great");
        }else if (grade>69){
            System.out.println("Good");
        }else if (grade>59) {
            System.out.println("Pass");
        }else {
            System.out.println("Failed");
        }
    }

    public static void initials(){

        Scanner input = new Scanner(System.in);

        System.out.println("Whats your First name?");

        String initialsfirst = (input.next().toLowerCase());

        String initfirst = String.valueOf(initialsfirst.charAt(0));


        System.out.println("Whats your Last name?");

        String initialslast = (input.next().toLowerCase());

        String initlast = String.valueOf(initialslast.charAt(0));

        String init = initfirst.toUpperCase()+", "+initlast.toUpperCase();

        System.out.println(init);

    }



}

