package day21_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {


    int[][] arrs = { {10,20,30},{40,50,60,70},{80,90,10}};



    for (int i = 0; i < arrs.length; i++) {
        int[] each10= arrs[i];
        System.out.println(Arrays.toString(each10));

        for (int j = 0; j < each10.length; j++) {

            int eachElement = each10[j];
            System.out.println(eachElement);



            }

        }

        System.out.println("-------------------------------------");

        for (int[] arr : arrs) {
            System.out.println(Arrays.toString(arr));

            for (int i : arr) {
                System.out.println(i);

            }

        }

        for (int i = arrs.length - 1; i >= 0; i--) {
            System.out.println(Arrays.toString(arrs[i]));


            }

    }


}
            

            




