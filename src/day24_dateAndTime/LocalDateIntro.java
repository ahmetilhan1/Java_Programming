package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate birthday = LocalDate.of(1996,9,18);
        System.out.println(birthday);

        System.out.println(birthday.getYear());
        System.out.println(today.getMonth());

        System.out.println(today.getDayOfMonth());

        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfYear());

        today = today.plusYears(1);

        System.out.println(today);
    }
}
