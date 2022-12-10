package day14_forLoop;

public class StringReverse {

    public static void main(String[] args) {

        String str = "Java";

        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        String name = "Ahmet Ilhan POLAT";

        String result = reverse(name);

        System.out.println(result);


    }

    public static String reverse(String str){
        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }


        return reverse;
    }
}
