package day9_Scanner;


import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num1 = input.nextByte();

        System.out.println("You Entered: "+ num1);

        System.out.println("\nEnter your Second Number: ");

        double num2 = input.nextDouble();

        input.close(); //scanner is closed can`t be used the get inputs

        System.out.println("You Entered: "+num2);

    }





}
