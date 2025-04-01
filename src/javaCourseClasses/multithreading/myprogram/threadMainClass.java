package javaCourseClasses.multithreading.myprogram;

public class threadMainClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        threadfirst tf1 = new threadfirst('@');
        threadfirst tf2 = new threadfirst('#');
        threadfirst tf3  = new threadfirst('$');
        threadSecond tf4 =new threadSecond('%');
        threadSecond tf5 = new threadSecond('*');
        threadSecond tf6 = new threadSecond('^');
        Thread t1 = new Thread(tf1);
        Thread t2 = new Thread(tf2);
        Thread t3 = new Thread(tf3);
        Thread t4 = new Thread(tf4);
        Thread t5 = new Thread(tf5);
        Thread t6 = new Thread(tf6);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
        }catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("total time of executing: "+(endTime-startTime));
    }
}
