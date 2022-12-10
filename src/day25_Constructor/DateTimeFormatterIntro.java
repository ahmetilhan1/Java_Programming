package day25_Constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("y/MMMM/dd/EEEE");

        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh-mm a");

        LocalTime time1 = LocalTime.of(17,30);

        System.out.println(time1.format(tf));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE hh:mm a, MM/dd/y");

        LocalDateTime starts = LocalDateTime.of(2020, 11, 24, 13, 0);

        System.out.println(starts.format(dtf));
    }
}
