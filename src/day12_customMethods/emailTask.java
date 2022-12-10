package day12_customMethods;

import java.util.Scanner;

public class emailTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your email");

        String email = input.nextLine().trim().replace(" "," ");

        String firstName = email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));

        String domain = email.substring(email.indexOf("@"));

        System.out.println(lastName+"_"+firstName+domain);
    }
}
