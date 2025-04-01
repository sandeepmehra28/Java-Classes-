package javaChallenges.multiThreading;

public class challengeTestClass {
    public static void main(String[] args) {
        long starTime = System.currentTimeMillis();
        Challenge1 c1 = new Challenge1(1);
        Challenge1 c2 = new Challenge1(2);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        t2.setPriority(Thread.MIN_PRIORITY);
         //t2.run();//they are showing the main method run the thread



        try{
            t1.join();
            t2.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("executing Time: "+(endTime-starTime)+" milliSec");
    }
}
