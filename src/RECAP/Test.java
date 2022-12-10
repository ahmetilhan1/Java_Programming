package RECAP;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String word = "Ahmet ilhan Polat";
        String reverse = "";

        String[] arr = word.split(" ");

        for (int i = arr.length-1; i >= 0; i--) {
            reverse += " "+arr[i];

        }

        reverse= reverse.trim();

        System.out.println(reverse);

        System.out.println(Arrays.toString(arr));

    }


}

