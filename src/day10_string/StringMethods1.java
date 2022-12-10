package day10_string;

import java.util.Scanner;

public class StringMethods1 {

    public static void main(String[] args) {

        System.out.println("----------------------------------");

        String s1 = "Wooden Spoon";

        char f = s1.charAt(0);


        int le = s1.length() - 1;

        char l = s1.charAt(le);

        System.out.println(f + ":" + l);

        System.out.println("------------------------------------");

        String name1 = "Umran";
        String name2 = new String("Umran");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        System.out.println("--------------------------------------");

        String r1 = "Java";
        String r2 = "Java";
        String r3 = new String("Java");

        System.out.println(r1==r2);
        System.out.println(r1.equals(r3));

        System.out.println("---------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you");
        int age = input.nextInt();

        System.out.println("Are you US citizen" );
        String answer = input.next();

        if(age>=21&&answer.equalsIgnoreCase("yes")){
            System.out.println("Eligible to Vote");

        }else{
            System.out.println("Not Eligible");
        }



    }
}
