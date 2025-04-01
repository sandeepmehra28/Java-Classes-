package javaCourseClasses.multithreading.ThreadLifeCycle.SleepMethod;

public class testThreadMethod {
    public static void main(String[] args) {
        SleepThreadMethod sm = new SleepThreadMethod('@');
        SleepThread2 sm2 = new SleepThread2('#');
        //sm.start();//agr hum ek thread class ko ek se jyada barr run karte hai to exception aaega
        sm.start();
        sm2.start();
    }
}
