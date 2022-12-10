package day19_ArrayIntro;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please provide the number of inputs you want");

        int howmany = input.nextInt();

        int[] arr1 = new int[howmany];

        int sum = 0;
        double averages = 0;

        DecimalFormat df = new DecimalFormat("0.00");

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Please provide a number");
            arr1[i] = input.nextInt();
            sum += arr1[i];
            averages = (double) sum / howmany;

        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(sum);
        System.out.println((averages));


    }

}
