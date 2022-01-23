package duke.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Time {

    public final int label;

    private Time(int label) {
        this.label = label;
    }

    public static String convertToString(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("d MMM yyyy"));
    }

    public static LocalDate convertToDate(String date) {
        String[] dates = date.split(" ");
        int year = Integer.parseInt(dates[2]);
        int day = Integer.parseInt(dates[0]);
        switch (dates[1]) {
        case "Jan":
            return LocalDate.of(year, 1, day);
        case "Feb":
            return LocalDate.of(year, 2, day);
        case "Mar":
            return LocalDate.of(year, 3, day);
        case "Apr":
            return LocalDate.of(year, 4, day);
        case "May":
            return LocalDate.of(year, 5, day);
        case "Jun":
            return LocalDate.of(year, 6, day);
        case "July":
            return LocalDate.of(year, 7, day);
        case "Aug":
            return LocalDate.of(year, 8, day);
        case "Sep":
            return LocalDate.of(year, 9, day);
        case "Oct":
            return LocalDate.of(year, 10, day);
        case "Nov":
            return LocalDate.of(year, 11, day);
        default:
            return LocalDate.of(year, 12, day);
        }
    }
}
