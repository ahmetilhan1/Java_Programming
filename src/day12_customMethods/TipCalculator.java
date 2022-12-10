package day12_customMethods;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Should we seperate the bill? (Yes or No)");
        String splitnosplit = input.next().toLowerCase();

        System.out.println("Enter the number of people?");
        int people = input.nextInt();

        System.out.println("Enter the check amount");
        double check = input.nextDouble();

        System.out.println("How was the Service Quality? (Excellent/Great/Good/Fair/Poor)");
        String service = input.next().toLowerCase();

        input.close();


        double totaltip = (service.equals("excellent"))? check*0.25:(service.equals("great"))? check*0.20: (service.equals("good"))? check*0.15:
                (service.equals("fair"))? check*0.10: check*0.05;

        double totaltopay = check +totaltip;

        System.out.println("people = " + people);
        System.out.println("totaltopay = " + totaltopay);
        System.out.println("totaltip = " + totaltip);

        if (splitnosplit.equals("yes")){
            System.out.println("Total per person: "+ (totaltopay/people));
            System.out.println("Tip per person: "+ (totaltip/people));
        }




    }
}
