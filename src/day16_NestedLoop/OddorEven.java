package day16_NestedLoop;

import java.util.Scanner;

public class OddorEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){


        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (number%2 == 0){
            System.out.println("is an even Number");
        }else{
            System.out.println("is an odd Number");
        }

        System.out.println("Would you like to enter a new number? Yes/No");
        String answer = input.next().toLowerCase();

        while(!(answer.equals("yes")||answer.equals("no"))){
            System.err.println("Invalid Entry! Would you like to enter another number? Yes/No");
            answer= input.next().toLowerCase();
        }

        if(answer.equals("no")){
            System.out.println("Thank you for using me");
            break;
            }

        }
    }
}
