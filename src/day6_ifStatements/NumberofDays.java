package day6_ifStatements;

public class NumberofDays {

    public static void main(String[] args) {

        int n = 2;
        boolean has28days = n == 2;
        boolean has30days = n == 4 || n == 6 || n == 9 || n == 11;
        boolean has31days = !has28days && !has30days;

        String result = "";

        if (has28days) {
            result = "28 days";
        }
        if (has30days) {
            result = "30 days";
        }
        if (has31days) {
            result = "31 days";
        }
        System.out.println(result);
    }
}
