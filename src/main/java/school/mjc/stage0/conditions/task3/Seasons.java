package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
//        var season = "wrong number!";
//        if (1 <= month && month <= 2 || month == 12) {
//            season = "Winter";
//        } else if (3 <= month && month <= 5) {
//            season = "Spring";
//        } else if (6 <= month && month <= 8) {
//            season = "Summer";
//        } else if (9 <= month && month <= 11) {
//            season = "Autumn";
//        }

        var season = 1 <= month && month <= 2 || month == 12 ? "Winter"
                : 3 <= month && month <= 5 ? "Spring"
                : 6 <= month && month <= 8 ? "Summer"
                : 9 <= month && month <= 11 ? "Autumn"
                : "wrong number!";
        System.out.println(season);
    }
}
