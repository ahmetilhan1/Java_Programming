package day22_ArrayList;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class TEst {

    public static void main(String[] args) {

        int[]numbers = {10,20,59,29,21,55,11};

        boolean has25 = ArraysUtility.contains(numbers,25);
        System.out.println(has25);

        String[] words = {"hello","hi","how are you","ilhan"};

        boolean hasilhan = ArraysUtility.contains(words,"ilhan");
        System.out.println(hasilhan);

    }
}
