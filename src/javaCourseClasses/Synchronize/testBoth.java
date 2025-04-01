package javaCourseClasses.Synchronize;

public class testBoth {
    public static void main(String[] args) {
        long startTime= System.currentTimeMillis();
        counter2 counter2 = new counter2();
        syncClass sc = new syncClass(counter2);
        syncClass sc2 = new syncClass(counter2);
        syncClass sc3 = new syncClass(counter2);
        syncClass sc4 =new syncClass(counter2);

        sc.start();
        sc2.start();
        sc3.start();
        sc4.start();

        try{
            sc.join();
            sc2.join();
            sc3.join();
            sc4.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(counter2.getCount());
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime)+" milliSec");
    }
}
