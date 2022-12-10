package day15_WhileLoop;

import java.util.Locale;
import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter your Age: ");

        int age = input.nextInt();

        while (!(age>0 && age<=120)){
            System.err.println("Invalid Entry. Please re-enter your age ");
            age = input.nextInt();
            }

        System.out.println("Are you a US citizen? Yes/No ");
        String yesorno = input.next().toLowerCase();

        while (!(yesorno.equals("yes")|| yesorno.equals("no"))){
            System.err.println("Invalid Entry! Please re-enter ");
            System.out.println("Are you a US citizen? Yes/No ");
            yesorno = input.next().toLowerCase();
        }

        if(age>=21 && yesorno.equals("yes")){
            System.out.println("Eligible to Vote");

    }else {
            System.out.println("You are not eligible");
        }
        input.close();
    }

}
