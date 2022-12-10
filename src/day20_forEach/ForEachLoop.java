package day20_forEach;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};

        for(int each : numbers){
            System.out.println(each);

        }
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11};

        for (int num : nums) {
            if(num%2!=0){
                System.out.println(num+" odd number");


            }
            System.out.println("-------------------------------");


                }
        int[] nu = {100,200,400,5,3,2,1,6,78,231,45,12};

        int max = nu [0];
        int min = nu [0];

        for (int i : nu) {
            if(i > max) {
                max = i;
            }
            if(i < min) {
                min=i;
            }

        }
        System.out.println(max);
        System.out.println(min);

        int[] a1 = {10,20,30,40};
        int[] a2 = {50,60,70,80};

        int[] a3 = new int [a1.length+ a2.length];

        int k = 0;

        for (int i : a1) {
            a3[k++] = i;
        }
        for (int i : a2){
            a3[k++] = i;
        }
        System.out.println(Arrays.toString(a3));

        String[] names = {"Mohammed Mahmut Karimi","Vasyl Dobrianski","Gadir Ibrahimov","Abidullah Rahimi"};

        for (String each : names) {
            System.out.println(each.charAt(0)+ "."+each.charAt(each.lastIndexOf(" ")+1)+".");
        }
    }
}
