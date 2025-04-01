package javaChallenges.multiThreading;

public enum challenge4Enum {
    RED(9000),
    YELLOW(1000)    ,
    GREEN(3000);
    private final int onTimeMills;

    challenge4Enum(int onTimeMills) {
        this.onTimeMills = onTimeMills;
    }

    public int getOnTimeMills() {
        return onTimeMills;
    }
}
