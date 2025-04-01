package javaChallenges.multiThreading;

public class challenge3Test {
    public static void main(String[] args) throws InterruptedException {
        challenge3 c1 = new challenge3(1);
        challenge3 c2 = new challenge3(2);
        challenge3 c3 = new challenge3(3);
        c1.start();
        c1.join();
        c2.start();
        c2.join();
        c3.start();
        c3.join();
    }
}
