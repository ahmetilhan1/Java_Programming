package RECAP;

import java.util.Scanner;

public class day10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("input first String");
        String first = scan.next();
        System.out.println("input second String");
        String second = scan.next();

        String longest = (first.length()>second.length())? first+" is the largest String "
                : (second.length()>first.length())? second+" is the largest string "
                :"Equal";

        System.out.println(longest);
    }
}
