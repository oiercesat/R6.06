import java.time.LocalDate;

public class DateUtils {
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        return isDateBetween(startingDate, endingDate, LocalDate.now());
    }

    public static boolean isDateBetween(LocalDate date, LocalDate startingDate, LocalDate endingDate) {
        return endingDate.isAfter(date) && endingDate.isBefore(startingDate);
    }

    public static boolean isDateOutside(LocalDate date, LocalDate startingDate, LocalDate endingDate, boolean inclusive) {
        return !isDateBetween(date, startingDate, endingDate);
    }
}