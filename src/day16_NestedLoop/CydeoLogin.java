package day16_NestedLoop;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CydeoLogin {

    public static void main(String[] args) {

        cydeoLogin();


    }

    public static void cydeoLogin(){

        Scanner input = new Scanner(System.in);


        System.out.println("Enter your Username: ");
        String u = input.next();

        System.out.println("Enter your Password: ");
        String p = input.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
            System.out.println("Logged in");
        } else {

            for (int i = 0; i < 3; i++) {
                System.err.println("Invalid Entry please re-enter");
                System.out.println("Enter your Username: ");
                u = input.next();
                System.out.println("Enter your Password: ");
                p = input.next();
                if(i==1){
                    System.err.println("\nThis is your last try\n");
                }

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                    System.out.println("Logged in");
                    break;


                }
            }

            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))){
                System.err.println("Your Account is now Locked");
            }
            input.close();

        }

    }
}
