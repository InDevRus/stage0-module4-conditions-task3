package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        System.out.println(second % first == 0 ? "Aliquot" : "Not aliquot");
    }
}
