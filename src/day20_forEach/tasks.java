package day20_forEach;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class tasks {

    public static void main(String[] args) {



    int[] numbers = {1,2,5,3,5};

    Arrays.sort(numbers);



        for (int i = 0; i < numbers.length; i++) {

           if(numbers[i]%2!=0){
               numbers[i]=numbers[i]*2;
           }
        }
        System.out.println(Arrays.toString(numbers));


    int[] arr1 = {1,2,3,4};
    int[] arr2 = {5,6,7};

    int[] arr3 = new int[arr1.length+ arr2.length];

    int k = 0;

        for (int i = 0; i < arr1.length; i++,k++) {

            arr3[k] += arr1[i];

        }
        for (int j = 0; j < arr2.length; j++,k++) {

            arr3[k]+=arr2[j];

        }

        System.out.println(Arrays.toString(arr3));

        int[] arr = {100,200,300,400,500};

        arr = ArraysUtility.reverse(arr);

        System.out.println(Arrays.toString(arr));


        int[] a1 = {1,4,4,3,5};
        int[] a2 = {1,2,3,4,5};

        Arrays.sort(a1);

        boolean equals = Arrays.equals(a1,a2);


        System.out.println(equals);

        String[] s1 = {"A","B","C"};
        String[] s2 = {"B","A","C"};

        Arrays.sort(s2);
        boolean equ = Arrays.equals(s1,s2);

        System.out.println(equ);

        int[] array = {10,20,30,40,50,60,70};

        int[] array2 = Arrays.copyOf(array,7);

        char[] ch = {'A','B','C','D','E','F'};

        char[] result1 = Arrays.copyOfRange(ch, 2 ,ch.length);

        System.out.println(result1);




    }

}

