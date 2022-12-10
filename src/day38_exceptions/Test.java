package day38_exceptions;

import Utilities.Library;
import day29_inheritance.AnimalTask.Tiger;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test {

    public static void main(String[] args) {

        System.out.println("Hello Cydeo");

        Library.sleep(3.5);

        System.out.println("How are you today");

        LocalTime time = LocalTime.now();

        if(LocalTime.now().equals(LocalTime.of(14,31))){
            throw new BreakTimeException();
        }



    }
}
