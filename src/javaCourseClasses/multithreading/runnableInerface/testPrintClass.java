package javaCourseClasses.multithreading.runnableInerface;

public class testPrintClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        printTask pt1 =new printTask('#');
        printTask pt2 = new printTask('$');
        printTask pt3 =  new printTask('@');
        Thread t1 = new Thread(pt1);
        Thread t2 = new Thread(pt2);
        Thread t3 = new Thread(pt3);
        t1.start();
        t2.start();
        t3.start();
        long endTime = System.currentTimeMillis();
        System.out.printf("%s total time: %d",Thread.currentThread().getName(),(endTime-startTime));
    }
}
