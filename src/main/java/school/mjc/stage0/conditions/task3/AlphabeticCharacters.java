package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char symbol) {
        var isEnglish = ('a' <= symbol && symbol <= 'z') || ('A' <= symbol && symbol <= 'Z');
        var symbolPosition = Character.toLowerCase(symbol) - 'a';
        var isVowel = symbolPosition == 0
                || symbolPosition == 4
                || symbolPosition == 9
                || symbolPosition == 14
                || symbolPosition == 20
                || symbolPosition == 24;
        System.out.println(!isEnglish ? "wrong alphabet!"
                : isVowel ? "Vowel"
                : "Consonant");
    }
}
