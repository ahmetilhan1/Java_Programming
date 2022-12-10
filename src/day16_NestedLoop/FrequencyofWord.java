package day16_NestedLoop;

public class FrequencyofWord {

    public static void main(String[] args) {

        String sentence = "Java Java Java Java";
        String word = "Java";

        int count = 0;

        while (sentence.contains(word)){
            count++;
            sentence = sentence.replaceFirst("Java","");


        }
    }
}
