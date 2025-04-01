package javaCourseClasses.Synchronize;
public class counterTest {
    public static void main(String[] args) throws InterruptedException{
        counter count = new counter();
        synchronizedThread st1 = new synchronizedThread(count);
        synchronizedThread st2 = new synchronizedThread(count);
        synchronizedThread st3 = new synchronizedThread(count);
        synchronizedThread st4 = new synchronizedThread(count);
        long start = System.currentTimeMillis();
        st1.start();
        st2.start();
        st3.start();
        st4.start();


        st1.join();
        st2.join();
        st3.join();
        st4.join();
        long end  =System.currentTimeMillis();
        System.out.println("final count is: "+count.getCount()
                +"\n"+"total time for executing : "+(end-start));
    }
}
