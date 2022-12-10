package day12_customMethods;

import java.util.Locale;
import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String first = input.next().trim().replace(" "," ");

        System.out.println("Enter your last name");
        String last = input.next().trim().replace(" "," ");

        input.close();


        /*String lowercasefullname = first.toLowerCase()+" "+last.toLowerCase();

        String firstchar = lowercasefullname.substring(0,1);
        String lastchar = last.substring(0,1);

        String fullname = firstchar.toUpperCase()+lowercasefullname.substring(1,)+" "+lastchar.toUpperCase()+lowercasefullname.lastIndexOf(" ");

        System.out.println(fullname);*/

        first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();

        last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();

        System.out.println(first +" "+last);
    }
}
