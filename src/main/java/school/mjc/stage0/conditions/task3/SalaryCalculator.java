package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("wrong input!");
            return;
        }

        var taxesPercentage = salary < 10000 ? 15
                : salary <= 20000 ? 18
                : 20;
        var taxedSalary = salary * (100 - taxesPercentage) / 100.0;
        System.out.println(taxedSalary);
    }
}
