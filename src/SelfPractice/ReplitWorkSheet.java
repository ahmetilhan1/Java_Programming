package SelfPractice;

import java.lang.reflect.Array;
import java.util.*;

public class ReplitWorkSheet {

    public static void main(String[] args) {

        /*String word = "ahmet";

        String reverse = "";

        if(word.length()>5){
            System.out.println("Too long!");
        }else if (word.length()<5){
            System.out.println("Too short!");
        }
        if(word.length()==5){
        for(int i = word.length()-1;i>=0;i--){

            reverse += word.charAt(i);
        }
        }
        System.out.println(reverse);*/

        /*char[] wovels = {'a', 'e', 'i', 'o', 'u'};

            for (int i = 0; i < word.length(); i++) {
                for(int j=0;j<wovels.length;j++){
                    char temp = wovels[j];
                if(temp==word.charAt(i)){
                    System.out.print(wovels[j]);*/

        /*Scanner input = new Scanner(System.in);
            ArrayList<String> namez = new ArrayList<>();
            String answer = "";
            String names = "";
            do {
                System.out.println("Please enter the guest's name:");
                namez.add(input.next());
                System.out.println("Do you want to enter another guest's name?");
                answer = input.next();
            } while (answer.equalsIgnoreCase("yes"));

            for(int i = 0 ; i<namez.size();i++){
                names += namez.get(i)+", ";
            }
            names = names.substring(0,names.length()-2);
            System.out.println("Guests' list: "+names);*/

        /*int triples = 0;

        for(int i = 0; i<str.length();i++){
            if(i+2<str.length()){
                String temp = str.substring(i,i+3);
                        if(temp.charAt(0)==temp.charAt(1)&&temp.charAt(0)==temp.charAt(2)&&temp.charAt(1)==temp.charAt(2)){
                            triples++;

            }
        }
        }
        System.out.println(triples);*/

        /*String s = "aaabbbcccd";
        String r = "";

        for (int i = 0 ; i<s.length();i++){
            String temp = s.substring(i,i+1);

            s = s.replaceFirst(temp,"");

            if(s.contains(temp)){
                if(!r.contains(temp)){
                    r+=temp;
            }
                }
            }
        System.out.println(r);*/



    }
}




    /*public static int wordCount(String words) {

        ArrayList<String> arr = new ArrayList<>();
        arr.addAll(List.of(words.split(" ")));
        int wordCounts = arr.size();
        // your code
        System.out.println(wordCounts);

        return wordCounts;
    }*/

























