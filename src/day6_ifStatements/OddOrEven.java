package day6_ifStatements;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 35;
        boolean isEven = number % 2 ==0; // to see if the remainder is 0 when divided by 2
        boolean isOdd = number % 2 != 0; // same logic but remainder should not be 0

       // boolean isOdd = !isEven;

        System.out.println("number is  = " + isEven);
        System.out.println("number is = " + isOdd);

    }
}
