package javaChallenges.multiThreading;

public class challenge4 extends Thread{
    private final challenge4Enum color;

    public challenge4(challenge4Enum color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("%s active \n", color);
        try {
            Thread.sleep(color.getOnTimeMills());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Inactive \n",color);
    }
}
