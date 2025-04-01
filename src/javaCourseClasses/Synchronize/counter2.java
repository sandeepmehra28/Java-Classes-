package javaCourseClasses.Synchronize;

public class counter2 {
    private int count=0;
    public synchronized void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }
}
