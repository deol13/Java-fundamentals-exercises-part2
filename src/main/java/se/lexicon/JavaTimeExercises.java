package se.lexicon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaTimeExercises {
    public static void main(String[] args) {
        // Exercise 1
        System.out.println("Exercise 1: ");

        LocalDate ex1Date = LocalDate.now();
        System.out.println(ex1Date);

        System.out.println("---------------");
        // Exercise 2
        System.out.println("Exercise 2: ");

        LocalDate ex2Date = LocalDate.now();
        String ex2DateFormatted = ex2Date.format(DateTimeFormatter.ofPattern("eeee dd MMM"));
        System.out.println(ex2DateFormatted);

        System.out.println("---------------");
        // Exercise 3
        System.out.println("Exercise 3: ");

        //LocalDate.now().minus(5);
        LocalDate ex3Date = LocalDate.parse("2025-03-03");//LocalDate.of(2025, 3, 1);
        for (int i = 0; i < 5; i++) {
            System.out.println(ex3Date.format(DateTimeFormatter.ISO_DATE));
            ex3Date = ex3Date.plusDays(1);
        }

        System.out.println("---------------");
        // Exercise 4
        System.out.println("Exercise 4: ");
        LocalDate ex4Date = LocalDate.parse("2024-12-01");
        System.out.println("---------------");
        // Exercise 5
        System.out.println("Exercise 5: ");

        LocalDate birthDate = LocalDate.parse("1993-07-04");
        System.out.println(birthDate.format(DateTimeFormatter.ISO_DATE) + " -> " + birthDate.getDayOfWeek());

        System.out.println("---------------");
        // Exercise 6
        System.out.println("Exercise 6: ");

        LocalDate ex6Date = LocalDate.now().minusYears(10).minusMonths(10);
        System.out.println("Month: " + ex6Date.getMonth());

        System.out.println("---------------");
        // Exercise 7
        System.out.println("Exercise 7: ");
        Period periodBetween = Period.between(birthDate, ex6Date);
        System.out.println("Years: " + periodBetween.getYears());
        System.out.println("Months: " + periodBetween.getMonths());
        System.out.println("Days: " + periodBetween.getDays());
        System.out.println("---------------");
        // Exercise 8
        System.out.println("Exercise 8: ");
        Period ex8Period = Period.parse("P4Y7M29D");
        LocalDate ex8Date = LocalDate.now();
        LocalDate futureDate = ex8Date.plus(ex8Period);
        System.out.println("Future day of 4y, 9m and 29d: " + futureDate.format(DateTimeFormatter.ISO_DATE));

        System.out.println("---------------");
        // Exercise 9
        System.out.println("Exercise 9: ");
        LocalTime ex9Time = LocalTime.now();
        System.out.println("Time: " + ex9Time);

        System.out.println("---------------");
        // Exercise 10
        System.out.println("Exercise 10: ");
        LocalTime ex10Time = LocalTime.now();
        System.out.println("Time.now's nanoseconds: " + ex10Time.getNano());

        System.out.println("---------------");
        // Exercise 11
        System.out.println("Exercise 11: ");
        LocalTime ex11Time = LocalTime.parse("13:37:00");
        System.out.println("Parsed time : " + ex11Time);
        System.out.println("---------------");
        // Exercise 12
        System.out.println("Exercise 12: "); // Not sure what's going on about the pattern the exercise want.
        LocalTime ex12Time = LocalTime.now();
        System.out.println("current time: " + ex12Time.truncatedTo(ChronoUnit.SECONDS).format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println("---------------");
        // Exercise 13
        System.out.println("Exercise 13: ");
        LocalDateTime ex13DateTime = LocalDateTime.parse("2018-04-05T10:00");
        System.out.println(ex13DateTime);
        System.out.println("---------------");
        // Exercise 14
        System.out.println("Exercise 14: ");
        System.out.println(ex13DateTime.format(DateTimeFormatter.ofPattern("eeee dd MMM H:mm")));
        System.out.println("---------------");
        // Exercise 15
        System.out.println("Exercise 15: ");
        LocalDate ex15Date = LocalDate.now();
        LocalTime ex15time = LocalTime.now();

        LocalDateTime ex15DateTime = LocalDateTime.parse(ex15Date + "T" + ex15time.truncatedTo(ChronoUnit.MINUTES));
        System.out.println("LocalDateTime:" + ex15DateTime);
        System.out.println("---------------");
        // Exercise 16
        System.out.println("Exercise 16: ");
        LocalDateTime ex16DateTime = LocalDateTime.now();
        LocalDate ex16Date = ex16DateTime.toLocalDate();
        LocalTime ex16Time = ex16DateTime.toLocalTime();
        System.out.println("Date: " + ex16Date.format(DateTimeFormatter.ISO_DATE));
        System.out.println("Time: " + ex16Time.format(DateTimeFormatter.ISO_TIME));
        System.out.println("---------------");

        // Exercise extra

    }
}
