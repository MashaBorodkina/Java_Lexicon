package se.lexicon.mb.JavaFundamental_Part2;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;


public class JavaTimeExercises {


    public static void main(String[] args) {
        //System.out.print(getCurrentDate());
        //System.out.print(getCurrentDateParse());
        //System.out.print(getLastMonday());
        //System.out.print(getCurrentDateParse());
        //System.out.println(getMyBirthdayWeekday());
        //getCurrentDateTime();
        //System.out.print(getDateTime());
        getDateTimeComponents();
    }

    public static LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    public static String getCurrentDateParse() {
        LocalDate current = LocalDate.now();
        String custom = current.format(DateTimeFormatter.ofPattern("eeee dd MMM YYYY"));
        return custom;
    }

    public static String getLastMonday() {
        LocalDate current = LocalDate.now();
        LocalDate lastMonday = current.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        return lastMonday.format(DateTimeFormatter.ISO_DATE);
    }

    public static LocalDate getLocalDateParse() {
        LocalDate current = LocalDate.now();
        String str = current.toString();
        LocalDate parsed = LocalDate.parse(str);
        return parsed;
    }

    public static String getMyBirthdayWeekday() {
        LocalDate birthday = LocalDate.of(2025, 7, 15);
        DayOfWeek weekDay = birthday.getDayOfWeek();
        return weekDay.toString();
    }

    public static void getCurrentDateTime() {
        LocalDateTime current = LocalDateTime.now();
        LocalDate currentDate = current.toLocalDate();
        LocalTime currentTime = current.toLocalTime();
        System.out.println(currentDate);
        System.out.println(currentTime);
    }
    public static LocalDateTime getDateTime(){
        LocalDateTime current = LocalDateTime.now();
        return current;
    }
    public static void getDateTimeComponents(){
        LocalDateTime current = LocalDateTime.now();
        LocalDate dateComp= current.toLocalDate();
        LocalTime timeComp = current.toLocalTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm");
        String formaterTime = timeComp.format(formatter);
        System.out.println("date:" + dateComp);
        System.out.println("time:" + formaterTime);
    }
}
