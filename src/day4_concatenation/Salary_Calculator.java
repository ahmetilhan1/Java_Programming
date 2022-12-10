package day4_concatenation;

import java.sql.SQLOutput;

public class Salary_Calculator {

    public static void main(String[] args) {

        String name = ("Salary of Ilhan = ");

        int hourly_rate = 20;
        int weekly_hours= 40;
        int Salary = (hourly_rate*weekly_hours)*52;

        System.out.println(name + Salary);
    }
}
