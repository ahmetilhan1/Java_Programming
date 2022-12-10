package day22_ArrayList;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "20";

        System.out.println(str + 1);

        int num1 = Integer.parseInt(str);

        System.out.println(num1+1);

        Integer num = Integer.valueOf(str);

        String s = "20.5";

        double num3 = Double.parseDouble(s);

        Double num4 = Double.valueOf(s);

        System.out.println(num3);
        System.out.println(num4);

        String x = "False";

        boolean tt = Boolean.parseBoolean(x);

        Boolean tts = Boolean.valueOf(x);

        System.out.println(tt);
        System.out.println(tts);

        char ch = 'a' ;

        boolean isDigit = Character.isDigit(ch);
        boolean isLetter = Character.isLetter(ch);

        boolean islowercaseletter = Character.isLowerCase(ch);
        boolean isuppercaseletter = Character.isUpperCase(ch);

        boolean specialcharacter  = !Character.isLetterOrDigit(ch);

        System.out.println("isDigit: "+isDigit);

        System.out.println("isLetter = " + isLetter);

        System.out.println("islowercaseletter = " + islowercaseletter);

        System.out.println("specialcharacter = " + specialcharacter);

        System.out.println("--------------------------------------------");

        String string = "a1b2c3d4e5";

        int sum = 0;

        String lets = "";

        for (char each : string.toCharArray()) {

            if(Character.isDigit(each)){
                sum +=Integer.parseInt(each+"");
        }
            if(Character.isLetter(each)){
                lets+=Character.toString(each);
            }
        }
        System.out.println(sum);
        System.out.println(lets);



    }
}
