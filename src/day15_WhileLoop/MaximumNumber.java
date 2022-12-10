package day15_WhileLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2323;

        for(int i = 0; i<5; i++){

            System.out.println("Enter a Number:");
            int num = input.nextInt();

            if(num>max){
                max=num;
            }

        }
        System.out.println(max);


    }
}
