package day23_ArrayListPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);


        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(numbers);

        list1.addAll(Arrays.asList(10,20,30,40,50));

        System.out.println(nums);
    }
}
