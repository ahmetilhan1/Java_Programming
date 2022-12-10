package day10_string;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Full Name");

        String name = input.nextLine();

        System.out.println("Please enter your building number");

        String buildingnum = input.next();

        input.nextLine();

        System.out.println("Now the street name");

        String streetname = input.nextLine();

        System.out.println("Enter your city name");

        String cityname = input.nextLine();

        System.out.println("Enter your State");

        String state = input.nextLine();

        System.out.println("Lastly Your ZIP code");

        int ZIP = input.nextInt();

        System.err.println("\nYOUR SHIPPING ADDRESS");

        System.out.println("\t"+buildingnum+",\t"+streetname);

        System.out.println("\t"+cityname+",\t"+state+", "+ZIP);

        input.close();

    }




}
