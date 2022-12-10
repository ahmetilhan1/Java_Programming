package day11_String;

import java.util.Locale;

public class StringMethods3 {

    public static void main(String[] args) {

        String word = "Wooden Spoon";

        boolean r1 = word.isEmpty();

        System.out.println(r1);

        System.out.println("=====================");

        String str = "             ";

        boolean r2 = str.isBlank();

        System.out.println(r2);


        String str1 = "Cydeo";

        String str3 = new String("JAVA");

        String str4 = "java";

        System.out.println(str3.equalsIgnoreCase(str4));

        System.out.println("============================================");

        String students = "Hasan Naran Sumeye Nataliia";

        boolean hasAhmed = students.contains("Ahmed");

        System.out.println("hasAhmed = "+hasAhmed);

        String sentence = "My favorite programming language is JAVA";

        boolean hasJava = sentence.toLowerCase().contains("java");

        System.out.println(hasJava);

        System.out.println("==============================================");

        String name = "Michael";

        boolean result1 = name.toLowerCase().startsWith("m");

        System.out.println(result1);


        String url = "www.cydeo.com";

        boolean valid = url.startsWith("www.") && url.endsWith(".com");

        System.out.println(valid);

        System.out.println("------------------------------------------------");

        String email = "CydeoSchool@gmail.com";

        boolean gmail = email.endsWith("@gmail.com");
        boolean yahoo = email.endsWith("@yahoo.com");
        boolean hotmail = email.endsWith("@hotmail.com");


        System.out.println("hotmail = " + hotmail);
        System.out.println("yahoo = " + yahoo);
        System.out.println("gmail = " + gmail);

    }
}
