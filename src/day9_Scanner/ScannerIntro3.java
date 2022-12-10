package day9_Scanner;

import java.util.Scanner;

public class ScannerIntro3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to Continue?");

        String answer = input.nextLine();

        System.out.println("You have Entered: "+answer);

        System.out.println("Anything Else? ");

        String answer2 = input.nextLine();

        System.out.println("Okay");

        System.out.println("\nGive Me a Character Then");

        char ch = input.next().charAt(0);

        System.out.println("You Have Entered = "+ch);

        input.close();




    }

}
