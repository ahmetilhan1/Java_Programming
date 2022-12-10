package day9_Scanner;

import java.util.Scanner;

public class NextLineMethodPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Full Name: ");

        String FullName = input.nextLine();

        System.out.println("Enter Your School Name: ");

        String SchoolName= input.nextLine();

        System.out.println("Enter Your Gender");

        char Gender = input.next().charAt(0);

        System.out.println("Enter Your Age: ");

        int Age = input.nextInt();

        input.nextLine();

        System.out.println("Enter Your Address: ");

        String Address = input.nextLine();


        System.out.println("\nFullName = " + FullName);
        System.out.println("SchoolName = " + SchoolName);
        System.out.println("Gender = " + Gender);
        System.out.println("Age = " + Age);
        System.out.println("Address = " + Address);

        input.close();



    }
}
