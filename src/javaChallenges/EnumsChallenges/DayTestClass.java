package javaChallenges.EnumsChallenges;

public class DayTestClass {
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        for (Day value : day.values()) {
            System.out.println(value);
        }
    }
}
