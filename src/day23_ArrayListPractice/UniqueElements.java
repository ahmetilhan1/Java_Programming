package day23_ArrayListPractice;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Ilhan");
        names.add("Baturay");

        for (String each : names) {
            if(names.indexOf(each)==names.lastIndexOf(each)){
                System.out.println(each);
                break;
            }


        }
    }
}
