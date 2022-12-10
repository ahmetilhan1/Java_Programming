package day23_ArrayListPractice;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        array[0] = 100;

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.remove(Integer.valueOf(30));
        System.out.println(numbers);

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Ali");

        System.out.println(names.indexOf("Vasyl"));
        System.out.println(names.lastIndexOf("Vasyl"));

    }
}
