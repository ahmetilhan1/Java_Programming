package day16_NestedLoop;

import java.util.Scanner;

public class FrequencyofCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = "aaabbccaa";

        char ch = 'a';

        int count = 0;

        int lenght = str.length();

        for (int i = 0; i < lenght ; i++) {
            if(str.charAt(i)==ch){
                count++;
            }
            }
        System.out.println(count);

        }



    }

