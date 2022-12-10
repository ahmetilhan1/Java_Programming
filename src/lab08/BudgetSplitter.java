package lab08;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BudgetSplitter {

    public static void main(String[] args) {

        System.out.println("Welcome to the Budget Planner!");

        System.out.println("How many people will be using the app?");

        Scanner input = new Scanner(System.in);

        int usercount = input.nextInt();

        ArrayList<String> users = new ArrayList<>();

        for(int i = 0; i <usercount;i++){

            System.out.println("Whats the name of the person");

            String user = input.next();
            users.add(user);
        }

        ArrayList<Double> eachpays = new ArrayList<>();

        System.err.println("\nEnter total spending?");

        double total = input.nextDouble();

        double each = total/usercount;

        System.out.println("Each person should pay "+each+"$");


        for (String user : users) {
            System.out.println("\n\nHow much did you pay? "+user);
            double eachpay = input.nextDouble();
            eachpays.add(eachpay);

        }


        for (int i = 0; i < users.size(); i++) {
            String eachperson = users.get(i);
            double eachpayper = eachpays.get(i);

            if(each>eachpayper){
                double hastopay = each-eachpayper;
                System.out.println("\n"+eachperson+" has to pay "+hastopay+"$");
            }else if (each<eachpayper){
                double hastobepaid = eachpayper-each;
                System.out.println("\n"+eachperson+" has to be paid "+hastobepaid+"$");
            }else {
                System.out.println("\n"+eachperson+" paid enough.");
            }


            System.out.println("Because "+eachperson+" paid "+eachpayper+"$");



        }




    }
}
