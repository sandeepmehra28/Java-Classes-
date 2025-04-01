package javaChallenges.multiThreading;
//. Create three threads. Ensure that the second thread starts only after
//the first thread ends and the third thread starts only after the second
//thread ends using the join method. Each thread should print its start
//and end along with its name.
public class challenge3 extends Thread{
    private final int numbThread;

    public challenge3(int numbThread) {
        this.numbThread = numbThread;
    }

    @Override
    public void run() {
            System.out.printf("%s Thread started -%d\n",
                   Thread.currentThread().getName(),numbThread);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Thread ended -%d\n",
                Thread.currentThread().getName(),numbThread);

    }
    }

