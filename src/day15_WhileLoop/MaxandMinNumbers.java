package day15_WhileLoop;

import java.util.Scanner;

public class MaxandMinNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -123113333;
        int min = 231231222;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a Number;");
            int number = input.nextInt();

            if(number>max){
                max=number;
            }
            if(number<min){
                min=number;
            }
        }
        System.out.println("Maximum number is:" +max);
        System.out.println("Minimum number is:" +min);
    }
}
