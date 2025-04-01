package javaCourseClasses.Synchronize;

public class counter {
    private  int count = 0;

    public synchronized void increment(){

        count++;
    }

    public int getCount() {
        return count;
    }
}
class synchronizedThread extends Thread{
    private counter counter;

    public synchronizedThread(counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i =0;i<5000;i++){
            counter.increment();
        }
    }
}
