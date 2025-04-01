package javaCourseClasses.Practice;

class multiThreading implements   Runnable{
    @Override
    public void run() {
        for(int i = 1;i<50;i++){
           try {
               Thread.sleep(400);
               System.out.print(" "+i);
           }catch (InterruptedException ie){
               System.out.print(" "+ie.getMessage());
           }
        }
    }
}

public class secondTest {
    public static void main(String[] args) {
        multiThreading mulT1 = new multiThreading();
        multiThreading mulT2 = new multiThreading();
        Thread t1 = new Thread(mulT1);
        Thread t2 = new Thread(mulT2);
        t1.start();
        t2.start();

    }
}
