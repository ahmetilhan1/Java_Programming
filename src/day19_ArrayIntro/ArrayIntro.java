package day19_ArrayIntro;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        int score1 = 85;
        int score2 = 75;
        int score3 = 65;
        int score4 = 55;


        System.out.println("-----------------------------------");

        int[] scores = new int[5];

        System.out.println(Arrays.toString(scores));

        for (int i = 0; i < scores.length; i++) {

            System.out.println(scores[i]);
            
        }


    }
}
