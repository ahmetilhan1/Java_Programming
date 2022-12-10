package day19_ArrayIntro;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice3 {

    public static void main(String[] args) {


        int[] max = new int[3];

        Scanner input = new Scanner(System.in);

        Random rand = new Random();

        int maxs = 0;
        for (int i = 0; i < max.length; i++) {

            max[i] = input.nextInt();


            if (max[i] > maxs) {
                maxs = max[i];
            }

        }
        System.out.println(maxs);
        System.out.println(Arrays.toString(max));

        System.out.println("=========================================");

        int[] maxx = new int[50];

        for (int i = 0; i < maxx.length; i++) {

            maxx[i] = i + 1;


            if ((i + 1) == maxx.length) {
                System.out.println((i + 1) + " is the biggest number");
            }

        }
        System.out.println(Arrays.toString(maxx));


    }
}
