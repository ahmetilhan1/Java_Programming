package day9_Scanner;

import java.util.Scanner;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter the Age: ");

        int age = input.nextInt();

        if (age >= 21) {
            System.out.println("You are Eligible to Buy Alcohol ");
        } else {
            System.err.println("You are NOT Eligible to Buy Alcohol");
        }


    }
}
