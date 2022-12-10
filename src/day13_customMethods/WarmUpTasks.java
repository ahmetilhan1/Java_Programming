package day13_customMethods;

import java.util.Scanner;

public class WarmUpTasks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Give me a number");

        calculate(input.nextDouble(), input.nextDouble(),'*');

    }

    public static void calculate (double  num1 ,double num2, char mathOperator){


        switch (mathOperator){
            case '+':
                System.out.println(num1 + "  "+mathOperator+" "+num2+ " = "+ (num1+num2));
                break;

            case '-':
                System.out.println(num1 + "  "+mathOperator+" "+num2+ " = "+ (num1-num2));
                break;

            case '*':
                System.out.println(num1 + "  "+mathOperator+" "+num2+ " = "+ (num1*num2));
                break;

            case '/':
                System.out.println(num1 + "  "+mathOperator+" "+num2+ " = "+ (num1/num2));
                break;

            default:
                System.err.println("Invalid operator: "+mathOperator);

        }


    }



}
