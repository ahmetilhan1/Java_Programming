package day21_MultiDimensionalArray;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        int[] arr1 = {10,20,30};
        int[] arr2 = {40,50,60,70,80};
        int[] arr3 = {90,100};

        System.out.println("=---------------------------------------");

        int[][] arrs = {arr1,arr2,arr3};

        int number = arrs[1][2];
        System.out.println(number);
    }
}
