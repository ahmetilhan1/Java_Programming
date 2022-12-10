package day19_ArrayIntro;

import java.util.Arrays;

public class ArrayPractice2 {


    public static void main(String[] args) {

        int[] arr100 = new int[100];

        /*for (int i = 0, j=10; i < arr100.length; i++,j+=10) {

            arr100[i] = j;*/

        for (int i = 0; i < arr100.length; i++) {

            arr100[i] = i+1;

            }
        int[] arr2 = new int[100];
        for (int i1 = 0; i1 < arr2.length; i1++) {

            arr2[i1] = 100-i1;

        }
        System.out.println(Arrays.toString(arr2));

        }

        }


