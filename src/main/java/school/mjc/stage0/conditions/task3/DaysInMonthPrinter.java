package school.mjc.stage0.conditions.task3;

import java.util.Objects;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        var daysCount = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> null;
        };

        System.out.println(Objects.requireNonNullElse(daysCount, "wrong number!"));
    }
}
