package Utilities;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cydeo School";

        char[] ch = str.replace(" ","").toCharArray();

        System.out.println(Arrays.toString(ch));

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'e'){
                System.out.println("Hello World");
            }
        }
        System.out.println("---------------------------------------------|");

        String str2 = "Today is a great day to learn java";

        String[] arr = str2.split(" ");

        arr = ArraysUtility.reverse(arr);

        System.out.println(Arrays.toString(arr));

        String reversed = "";

        for (int i = 0; i < arr.length; i++) {
            reversed+=arr[i];


            if(arr[i].equalsIgnoreCase("GREAT")){
                System.out.println("Hello World");
            }

        }
        System.out.println(reversed);
    }
}
