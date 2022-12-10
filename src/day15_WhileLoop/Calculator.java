package day15_WhileLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {





        /*Scanner input = new Scanner(System.in);

        System.out.println("Enter Your First Number:");
        double num1 = input.nextDouble();
        System.out.println("Enter Your Second Number:");
        double num2 = input.nextDouble();
        System.out.println("Enter a Math operator:");
        char operator = input.next().charAt(0);

            while (!(operator == '+'|| operator=='-'||operator=='*'||operator=='/')){
                System.err.println("Invalid Operator! Please re-enter the math operator");
                operator = input.next().charAt(0);
            }

            if (operator=='-'){
                System.out.println(num1-num2);
            }else if (operator=='+'){
                System.out.println(num1+num2);
            }else if (operator=='*'){
                System.out.println(num1*num2);
            }else {
                System.out.println(num1/num2);
            }
            input.close();*/
    }

    public static void Calculators (){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your First Number:");
        double num1 = input.nextDouble();
        System.out.println("Enter Your Second Number:");
        double num2 = input.nextDouble();
        System.out.println("Enter a Math operator:");
        char operator = input.next().charAt(0);

        while (!(operator == '+'|| operator=='-'||operator=='*'||operator=='/')){
            System.err.println("Invalid Operator! Please re-enter the math operator");
            operator = input.next().charAt(0);
        }

        if (operator=='-'){
            System.out.println(num1-num2);
        }else if (operator=='+'){
            System.out.println(num1+num2);
        }else if (operator=='*'){
            System.out.println(num1*num2);
        }else {
            System.out.println(num1/num2);
        }
        input.close();

    }



}
