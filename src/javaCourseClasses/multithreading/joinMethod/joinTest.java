package javaCourseClasses.multithreading.joinMethod;
//join statement se hum thread ko control kar sakte hai
public class joinTest {
    public static void main(String[] args) throws InterruptedException{
        JoinClass jc1 = new JoinClass('@');
        JoinClass jc2 = new JoinClass('#');
        JoinClass jc3 = new JoinClass('$');
        Thread t1=  new Thread(jc1);
        t1.start();
        System.out.println("\n thread 1 started");
        Thread t2 = new Thread(jc2);
        t2.start();
        System.out.println("\n thread 2 started");
        t1.join();
        Thread t3 = new Thread(jc3);
        t3.start();
        System.out.println("\n thread 3 started");
    }
}
