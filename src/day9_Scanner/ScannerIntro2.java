package day9_Scanner;

import java.util.Scanner;

public class ScannerIntro2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your First Decimal Number(Float): ");

        float num = input.nextFloat();

        System.out.println("Enter Your First Decimal Number(Double): ");

        double num2 = input.nextDouble();

        System.out.println("Enter True or False: ");

        boolean r = input.nextBoolean();

        System.out.println("Your First Decimal Number(Float): " + num);
        System.out.println("Enter Your First Decimal Number(Double): " + num2);
        System.out.println("True or False: " + r);

        input.close();







    }
}
