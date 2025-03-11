package se.lexicon;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//Extra challenge
public class Calender {
    //Show years?
    //Show months in this year
    //Show days in this month


    //Show this week
    public static void ShowThisWeek(int year) {
        LocalDate date = LocalDate.now();
        String currentDay = date.format(DateTimeFormatter.ofPattern("eeee"));
        int currentDayIndex = GetDayOfWeek(currentDay);

        System.out.printf("Week " + WeekNumber(year) + ": ");
        for (int i = 0; i < 7; i++) {
            if(i == currentDayIndex)
                System.out.printf("[" + currentDay + "] ");
            else
                System.out.printf(date.plusDays(i).format(DateTimeFormatter.ofPattern("eeee")) + " ");
        }
    }

    //Show today's date
    public static String ShowTodaysDate() {
        return String.valueOf(LocalDate.now().format(DateTimeFormatter.ofPattern("eeee dd MMM")));
    }

    //Have to check which day the first day of this year is, add the other days of that week that belong to last month to the total of days this year.
    //Divide with 7 then add one to know which week it is?
    public static int WeekNumber(int year){
        //Create a LocalDate of the first day of this year.
        LocalDate firstDayOfTheYear = LocalDate.of(year,1,1);
        //Get which day was the first day and get how many days was before it in that week.
        int extraDays = GetDayOfWeek(firstDayOfTheYear.format(DateTimeFormatter.ofPattern("eeee")));

        //Add the total days of this year and extra days then divide by 7
        int weeks = (LocalDate.now().getDayOfYear() + extraDays) / 7;
        //Add a one to get the actual week.
        return weeks + 1;
    }

    private static int GetDayOfWeek(String day){
        return switch (day) {
            case "måndag" -> 0;
            case "tisdag" -> 1;
            case "onsdag" -> 2;
            case "torsdag" -> 3;
            case "fredag" -> 4;
            case "lördag" -> 5;
            case "söndag" -> 6;
            default -> -1;
        };
    }
}
