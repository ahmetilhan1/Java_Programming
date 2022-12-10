package day19_ArrayIntro;

import java.util.Arrays;

public class ArrayLiteral {

    public static void main(String[] args) {


        int[] numbers = new int[5];

        int[] nums = {10,20,30,40,50};

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("nums = " + Arrays.toString(nums));

        System.out.println("================================================");

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        int n = days.length;

        System.out.println(days[n-1]);

        System.out.println("================================================");




    }
}
