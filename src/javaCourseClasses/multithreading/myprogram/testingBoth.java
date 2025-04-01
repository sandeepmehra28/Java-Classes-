package javaCourseClasses.multithreading.myprogram;

public class testingBoth {
    public static void main(String[] args) throws InterruptedException{
        long start = System.currentTimeMillis();
        printFirst pf1= new printFirst('#');
        printFirst pf2= new printFirst('*');
        printFirst pf3= new printFirst('%');
        printSecond ps11 = new printSecond('$');
        printSecond ps22 = new printSecond('!');
        printSecond ps33 = new printSecond('^');
        Thread t1 = new Thread(pf1);
        Thread t2 = new Thread(pf2);
        Thread t3 = new Thread(pf3);
        Thread t11 = new Thread(ps11);
        Thread t22 = new Thread(ps22);
        Thread t33 = new Thread(ps33);

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        t3.setPriority(Thread.NORM_PRIORITY);
        t3.start();
        t11.setPriority(Thread.NORM_PRIORITY);
        t11.start();
        t22.setPriority(Thread.MAX_PRIORITY);
        t22.start();
        t33.setPriority(Thread.MAX_PRIORITY);
        t33.start();

        t1.join();
        t2.join();
        t3.join();
        t11.join();
        t22.join();
        t33.join();
        long end = System.currentTimeMillis();
        System.out.println("total time for executing: "+(end-start));
    }
}
