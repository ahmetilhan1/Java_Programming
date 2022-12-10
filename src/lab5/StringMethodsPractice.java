package lab5;

public class StringMethodsPractice {

    public static void main(String[] args) {

        //String name2 = "Cydeo School";

        String name = "Josh Daniel";

        char ch = name.charAt(4);

        int lastindex = name.length()-1;

        char ch3 = name.charAt(lastindex);

        System.out.println(ch3);


        String everychar = "BoomBoom Double";

        for (int i = 0; i < everychar.length(); i++) {

            char every = everychar.charAt(i);

            System.out.println(every);

        }



    }
}
