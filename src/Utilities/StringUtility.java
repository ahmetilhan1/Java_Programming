package Utilities;

public class StringUtility {


    public static String reverse(String str){
        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }


        return reverse;
    } //need to give a string value





}
