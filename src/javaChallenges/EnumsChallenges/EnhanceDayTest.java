package javaChallenges.EnumsChallenges;

public class EnhanceDayTest {
    public static void main(String[] args) {
        for (EnhanceDay value : EnhanceDay.values()) {
            System.out.printf("%s [%s]\n",value,value.getWeekDays());
        }
    }
}
