package day6_ifStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 65;

        boolean isDivisibleby2 = number%2==0;
        boolean isDivisibleby3 = number%3==0;
        boolean isDivisibleby5 = number%5==0;
        boolean isDivisibleby6 = isDivisibleby3 && isDivisibleby2;

        System.out.println(number + " is divisible by 2: " + isDivisibleby2);
        System.out.println(number + " is divisible by 3: " + isDivisibleby3);
        System.out.println(number + " is divisible by 5: " + isDivisibleby5);
        System.out.println(number + " is divisible by 6: " + isDivisibleby6);
    }
}
