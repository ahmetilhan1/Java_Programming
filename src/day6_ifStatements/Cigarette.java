package day6_ifStatements;

public class Cigarette {


    public static void main(String[] args) {

        int age =18;

        if(age >=21 && age <100 ) {
            System.out.println("You are eligible to buy cigarettes");
        }
        if(age <21) {
            System.err.println("You are not eligible to buy cigarettes");
        }
    }
}
