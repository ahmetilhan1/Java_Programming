package day9_Scanner;

import java.util.Scanner;

public class OddorEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number: ");

        int num = input.nextInt();


        if (num%2==0){

            System.out.println("\nThe Number you Entered is: Even ");

        }else {
            System.out.println("\nThe Number you Entered is: Odd ");
        }

        input.close();
    }
}
