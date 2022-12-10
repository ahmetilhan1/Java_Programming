package day23_ArrayintePractice;

import java.util.ArrayList;

public class firstUniqueElement {

    public static void main(String[] args) {

        ArrayList <Integer> inte = new ArrayList<>();
        inte.add(1);
        inte.add(2);
        inte.add(1);
        inte.add(4);
        inte.add(5);


        for (Integer element : inte) {


            int frequency = 0;
            for (Integer each : inte) {
                if (each == element) {
                    frequency++;
                }

            }
            if(frequency==1){
                System.out.println(element);
                break;
            }

        }


        System.out.println(inte);
        
    }
}
