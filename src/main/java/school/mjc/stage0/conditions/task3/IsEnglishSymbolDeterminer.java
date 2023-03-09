package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        var isEnglish = ('a' <= symbol && symbol <= 'z') || ('A' <= symbol && symbol <= 'Z');
        System.out.println(isEnglish ? "English" : "Non English");
    }
}
