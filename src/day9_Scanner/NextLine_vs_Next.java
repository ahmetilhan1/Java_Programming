package day9_Scanner;

import java.util.Scanner;

public class NextLine_vs_Next {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Age: ");

        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter Your Full Name: ");

        String name = input.nextLine();



        System.out.println("\nAge = " + age);
        System.out.println("Full Name = " + name);




    }
}
