package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        System.out.println(number == 0 ? "cannot divide by zero"
                : (number % 5 + number % 11) == 0 ? "Dividable"
                : "Non-dividable");
    }
}
