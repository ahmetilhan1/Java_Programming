package day16_NestedLoop;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true) {


            System.out.println("Please enter a number");
            double number = input.nextDouble();
            System.out.println("Please enter the second number ");
            double number2 = input.nextDouble();
            System.out.println("Please enter a math operator");
            char operator = input.next().charAt(0);

            while(!(operator=='/'||operator=='*'||operator=='-'||operator=='+')){
                System.err.println("You have entered a wrong operator. Enter a new one:");
                operator=input.next().charAt(0);
            }

            double result = 0;

            if (operator == '+') {
                result = number + number2;
            } else if (operator == '*') {
                result = number * number2;
            } else if (operator == '/') {
                result = number / number2;
            } else if (operator == '-'){
                result = number - number2;
            }

                System.out.println(result);

            System.out.println("Would you like to continue? Yes/No");
            String cont = input.next().toLowerCase();


            while(!(cont.equals("yes")||cont.equals("no"))){
                System.err.println("Please enter a valid answer: Yes/No");
                cont= input.next().toLowerCase();
            }
            if(cont.equals("yes")){
                continue;
            }else if (cont.equals("no")){
                break;
            }


        }
    }
}
