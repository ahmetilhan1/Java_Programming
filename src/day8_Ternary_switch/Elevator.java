package day8_Ternary_switch;

public class Elevator {
    public static void main(String[] args) {

        int FloorNumber = 3;

        String result = "Invalid Floor";

        if (FloorNumber >= 1 && FloorNumber <= 3) {

            result ="FloorNumber " + FloorNumber + " \nCompanies: ";
            if (FloorNumber == 1) {
                result += "Java, Cydeo, Chase";
            } else if (FloorNumber == 2) {
                result += "acer, apple, Nasa";
            } else {
                result += "BoFa, Lyft, Nusret";
            }

        }
        System.out.println(result);
    }
}