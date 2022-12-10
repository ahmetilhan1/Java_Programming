package day7_ifstatements;

public class MonthName {

    public static void main(String[] args) {

        int number = 14;

        String result = "";

        if (number >= 1 && number <= 12) {

            if (number == 1) {
                result = "January";
            } else if (number == 2) {
                result = "February";
            } else if (number == 3) {
                result = "March";
            } else if (number == 4) {
                result = "April";
            } else if (number == 5) {
                result = "May";
            } else if (number == 6) {
                result = "June";
            } else if (number == 7) {
                result = "July";
            } else if (number == 8) {
                result = "August";
            } else if (number == 9) {
                result = "September";
            } else if (number == 10) {
                result = "October";
            } else if (number == 11) {
                result = "November";
            } else if (number == 12) {
                result = "December";
            }

        } else {
            System.out.println("Invalid Month");
        }
        System.out.println(result);
    }
}
