import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        new SimpleClass();
        DateUtils.isNowBetween(LocalDate.MIN, LocalDate.MAX);
        DateUtils.isDateBetween(LocalDate.of(2019, 1, 1), LocalDate.MIN, LocalDate.MAX);
    }
}


