package javaChallenges.multiThreading;
//Write a program that creates two threads. Each thread should print
//"Hello from Thread X", where X is the number of the thread (1 or 2),
//ten times, then terminate.
public class Challenge1 extends Thread{
    private final int threadNumber;

    public Challenge1(int threadNumber) {

        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for(int i = 1;i<=10;i++){
            System.out.printf("(%d) %s Hello form %d\n"
                    ,i,Thread.currentThread().getName(),
                    threadNumber);

        }
    }
}
