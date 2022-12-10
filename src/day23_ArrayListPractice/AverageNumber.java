package day23_ArrayListPractice;

import java.util.ArrayList;

public class AverageNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println(list);
        int sum = 0 ;

        for (Integer each : list) {
            sum += each;

        }

        System.out.println(sum);

    }
}
