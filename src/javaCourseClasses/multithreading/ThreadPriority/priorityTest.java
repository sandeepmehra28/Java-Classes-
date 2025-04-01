package javaCourseClasses.multithreading.ThreadPriority;

public class priorityTest {
    public static void main(String[] args) throws InterruptedException {
        priorityCLass pt1= new priorityCLass('#');//create a priority class object
        priorityCLass pt2= new priorityCLass('$');//create a priority class object
        priorityCLass pt3= new priorityCLass('*');//create a priority class object
        Thread t1=  new Thread(pt1);// object passing in Thread constructor
        Thread t2=  new Thread(pt2);// object passing in Thread constructor
        Thread t3=  new Thread(pt3);// object passing in Thread constructor
        t1.setPriority(1);//priority set
        t2.setPriority(1);//priority set
        t3.setPriority(Thread.MAX_PRIORITY);//priority set
        t1.start();
        t2.start();
        t1.join();
        t3.start();
        Thread.currentThread().setPriority(10);//set priority
        System.out.println("current main priority: "+
                Thread.currentThread().getPriority());//get priority
    }
}
