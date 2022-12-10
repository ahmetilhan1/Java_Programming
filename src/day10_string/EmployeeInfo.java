package day10_string;

import java.util.Scanner;

public class EmployeeInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.nextLine();

        System.out.println("Enter your gender");
        char gender = input.next().charAt(0);

        System.out.println("Enter your Age");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your Company name");
        String companyname = input.nextLine();

        System.out.println("Enter your Job Title");
        String jobtitle = input.nextLine();

        System.out.println("Enter your Salary");
        double salary = input.nextDouble();

        System.err.println("\t\tEmployee INFO");

        System.out.println("\t"+name+", "+age+", "+gender);
        System.out.println("\t"+companyname+", "+jobtitle+", $"+salary);

        input.close();


    }
}
