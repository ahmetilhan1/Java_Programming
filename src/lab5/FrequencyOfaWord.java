package lab5;

public class FrequencyOfaWord {

    public static void main(String[] args) {

        String sentence = "Java Java Java Java Java Python C# Ruby";

        int original_length = sentence.length();

        String temp = sentence;

        temp = temp.replace("Java", "abc");

        int new_length = temp.length();

        System.out.println(original_length);

        System.out.println(new_length);

    }
}
