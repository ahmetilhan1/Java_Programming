package RECAP;

import java.sql.Array;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class day15 {

    public static void main(String[] args) {

        String str = "aadsadadagadqweqabbbccc";
        String unique = "";
        char[] carray = str.toCharArray();


        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(str.charAt(i));
            }
        }
        String characters = "";
        String duplicates = "";
        for (int i = 0; i < str.length(); i++) {
            String current = Character.toString(str.charAt(i));
            if(characters.contains(current)){
                if(!duplicates.contains(current)){
                    duplicates+=current;
                }
            }
            characters+=current;

        }

        for (int i = 0; i < str.length(); i++) {
            String current = Character.toString(str.charAt(i));
            if(duplicates.contains(current)){
                str = str.replace(str.charAt(i),' ');
            }

        }
        str = str.replaceAll(" ","");
        System.out.println(str);

        char[] charstr = str.toCharArray();

        System.out.println(charstr);

        char[] chare =duplicates.toCharArray();

        List<Character> list = new ArrayList<>();
        for(Character character: chare){
            list.add(character);
        }
        System.out.println(list);

        char c = list.get(4);
        System.out.println(c);

            }
        }


