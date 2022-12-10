package day13_customMethods;

import java.util.Locale;
import java.util.Scanner;

public class ReturnStatementPractice {

    public static void main(String[] args) {

        char grade = new Scanner(System.in).next().toUpperCase().charAt(0);

        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';

        if (!isValid) {
            System.err.println("Invalid Grade");
            return;
        }
        System.out.println(
                  grade == 'A' ? "Excellent"
                : grade == 'B' ? "Great"
                : grade == 'C' ? "Good"
                : grade == 'D' ? "Pass"
                : "Fail" );

    }
}
