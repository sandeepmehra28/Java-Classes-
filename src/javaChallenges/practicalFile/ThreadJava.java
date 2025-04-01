package javaChallenges.practicalFile;
//explain the Thread in java with example
class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print(" Thread1 = "+i);
        }
        System.out.println();
    }
}
class Thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print(" Thread2 = "+i);
        }
        System.out.println();
    }
}
public class ThreadJava {
    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }
}
