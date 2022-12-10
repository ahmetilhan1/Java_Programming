package day6_ifStatements;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = 1000;

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        //boolean isZero = number == 0;


        boolean isZero = !isPositive && !isNegative;
        if(isPositive) {

            System.out.println(number + " is positive number: " + isPositive);

            System.out.println(number + " is negative number: " + isNegative);
        }
        System.out.println(number + " is zero:            "+ isZero);
    }
}
