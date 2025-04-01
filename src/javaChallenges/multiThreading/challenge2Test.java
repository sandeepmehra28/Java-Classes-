package javaChallenges.multiThreading;

public class challenge2Test {
    public static void main(String[] args) throws InterruptedException{
        challenge2 c2 = new challenge2();
        System.out.printf("created the Thread :  %s \n", c2.getState());//they are showing the current state
        c2.start();
//        System.out.printf("RUNNABLE the Thread: %s ", c2.getState());//they're showing after run state
        c2.join();
        System.out.printf("Thread finished :  %s ", c2.getState());//they're showing after run state
    }
}
