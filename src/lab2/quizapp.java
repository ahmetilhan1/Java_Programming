package lab2;

import java.util.Scanner;

public class quizapp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int itemPrice = 9;


        System.out.println("Please select the deal you would like use");
        int dealId = scanner.nextInt();

        System.out.println("Please enter item count you would like to buy: ");
        int itemCount = scanner.nextInt();

        int customerCartTotal = itemPrice * itemCount;

        int advicedDealId = 0;
        double amountWithSelectedDeal = 0;
        // deal1 calculations
        double amountWithDeal1 = customerCartTotal * 0.1;
        // deal2 calculations
        double amountWithDeal2 = customerCartTotal - 5;
        // deal3 calculations
        double amountWithDeal3 = (customerCartTotal * 15) / 100;


        if (dealId == 1) {
            amountWithSelectedDeal = customerCartTotal-amountWithDeal1;
        } else if (dealId == 2) {
            amountWithSelectedDeal = customerCartTotal-amountWithDeal2;
        } else {
            amountWithSelectedDeal = customerCartTotal-amountWithDeal3;
        }
        double amountWithAdvicedDeal = 0;

        if ((amountWithDeal1 < amountWithDeal2)) {
            if ((amountWithDeal2 < amountWithDeal3)) {
                advicedDealId = 1;
                amountWithAdvicedDeal = amountWithDeal1;
            } else {
                advicedDealId = 2;
                amountWithAdvicedDeal = amountWithDeal2;
            }
        } else if (amountWithDeal1 < amountWithDeal3) {
            advicedDealId = 3;
            amountWithAdvicedDeal = amountWithDeal3;
        }

        if (dealId == advicedDealId) {
            System.out.println("You have made excellent choice");
            System.out.println("Your cart without discount: " + customerCartTotal);
            System.out.println("Your cart with discount: " + amountWithAdvicedDeal);
        } else {
            System.out.println("There is an another deal option for you. dealId: " + advicedDealId);
            System.out.println("If you still would like to use dealId: " + dealId + " price will be " + amountWithSelectedDeal);
            System.out.println("If you use our advice  dealId: " + advicedDealId + " price will be " + amountWithAdvicedDeal);
        }

    }
}

