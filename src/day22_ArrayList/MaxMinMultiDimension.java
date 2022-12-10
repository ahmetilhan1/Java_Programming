package day22_ArrayList;

import java.util.Arrays;

public class MaxMinMultiDimension {

    public static void main(String[] args) {

        int[][] array = {{100, 200, 20}, {10, 200000, 50}, {-700, 400, 0}}; //0-2 index numbers

        int max = array[0][0];
        int min = array[0][0];

        for (int[] each : array) {
            for (int eachelement : each) {
                System.out.println(eachelement);
                if (eachelement > max) {
                    max = eachelement;
                }
                if (eachelement < min) {
                    min = eachelement;
                }
            }

        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minumum number is: " + min);

    }
}

