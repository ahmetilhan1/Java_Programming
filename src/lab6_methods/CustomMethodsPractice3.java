package lab6_methods;

import java.util.Locale;

public class CustomMethodsPractice3 {


    public static void main(String[] args) {
        System.out.println(doublechar("sdsdsds"));


        System.out.println(endsly("sdqwqeqweqwely"));

        System.out.println(hasbad("xbadxxxx"));

        System.out.println(atFirst("a"));

        System.out.println(ispalindrome("sddffg"));



    }

    public static String doublechar(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            result +=each;
            result +=each;
        }

        return result;
    }
    public static boolean endsly(String str) {
        str = str.toLowerCase();

        if (str.substring(str.length() -2).equals("ly")) {
            return true;
        }
        return false;
    }
    public static boolean hasbad(String str){

        if(str.equals("bad")){
            return true;
        }

        if(str.length()<4){
            return false;

        }
        if(str.substring(0,3).equals("bad")){
            return true;
        }
        if (str.substring(1,4).equals("bad")){
            return true;
        }
        return false;

    }
    public static String atFirst(String str){
        if (str.isEmpty()){
            return "@@";
        } else if (str.length()==1) {
            return str+"@";
        }else {
            return str.substring(0,2);
        }
    }
    public static boolean ispalindrome(String str){

        return StringUtility.reverse(str).equalsIgnoreCase(str);
    }




}




