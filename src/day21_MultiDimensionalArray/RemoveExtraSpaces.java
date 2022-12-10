package day21_MultiDimensionalArray;

import java.util.Arrays;

public class RemoveExtraSpaces {

    public static void main(String[] args) {

        String str = "    Hello      world              i                 love           Java       ";


        String[] words = str.split(" ");

        System.out.println(Arrays.toString(words));
        
        str = "";

        for (String word : words) {

            if(!word.isEmpty()){
                str+=word+" ";
            }
            
        }
        str= str.trim();
        System.out.println(str);
    }
}
