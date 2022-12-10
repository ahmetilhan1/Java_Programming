package day21_MultiDimensionalArray;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "earth";

        String[] finder = str1.split("");
        String[] finder2 = str2.split("");

        Arrays.sort(finder);
        Arrays.sort(finder2);

        String anagram = "";

        System.out.println(Arrays.toString(finder));
        System.out.println(Arrays.toString(finder2));


        if(Arrays.equals(finder,finder2)){
            anagram= str1+" and "+str2+" are anagrams";
        }else{
            anagram=str1+" and "+str2+" are not anagrams";
        }


        System.out.println(anagram);
    }
}
