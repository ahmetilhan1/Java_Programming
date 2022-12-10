package lab6_methods;

public class StringUtility {

    public static int frequency(String sentence, String word) {

        int count = 0;

        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            count++;
        }

        return count;
    }

    public static String reverse(String word){

        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            char each = word.charAt(i);
            result += each;
        }
       return result ;
    }
    public static String removedup(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(!result.contains(""+each)){
                result+=each;
            }

        }
        return result;
    }
    public static int frequency(String str,char ch){

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch){
                count++;
            }

        }
        return count;
    }

    }




