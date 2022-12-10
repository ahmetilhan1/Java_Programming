package day15_WhileLoop;

import java.util.Locale;
import java.util.Scanner;

public class DublicatedChar {

    public static void main(String[] args) {

        String str = "";

        String result = "";



        Scanner input = new Scanner(System.in);

        str = input.next();

        for (int i = 0; i < str.length()-1; i++) {

            char each = str.charAt(i);

            if(!result.contains(""+ each)){
                result += each;
            }





        }
        System.out.println(result);

    }
}
