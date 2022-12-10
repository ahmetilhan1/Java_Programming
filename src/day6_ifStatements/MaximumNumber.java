package day6_ifStatements;

public class MaximumNumber {

    public static void main(String[] args) {

        int num1 = 35,
                num2 = 35;

        if (num1 > num2) {
            System.out.println(num1 + " is the maximum number.");
        }
        if (num2 > num1) {
            System.out.println(num2 + " is the maximum number.");
        }
        if (num1 == num2) {
            System.out.println("Equal");
        }
    }
}
