package javaCourseClasses.multithreading.ThreadPriority;

public class PriorityCheck extends Thread{
    private final char tested;

    public PriorityCheck(char tested) {
        this.tested = tested;
    }
    @Override
    public void run() {
        for(int i = 0;i<50;i++){
            System.out.printf("%c",tested);
            //Thread.yield();//
            try{
                Thread.sleep(100);
            }catch (InterruptedException ie){
                System.out.println(ie);
            }
        }
    }

    public static void main(String[] args) throws  InterruptedException{
        long startTime = System.currentTimeMillis();
        PriorityCheck pc1 = new PriorityCheck('$');
        // Creating a Thread object and passing reference of priorityChecker
        Thread t1 = new Thread(pc1);
        PriorityCheck pc2 = new PriorityCheck('#');
        // Creating a Thread object and passing reference of priorityChecker
        Thread t2 = new Thread(pc2);
        PriorityCheck pc3 = new PriorityCheck('*');
        // Creating a Thread object and passing reference of priorityChecker
        Thread t3 = new Thread(pc3);
        t1.setPriority(Thread.MIN_PRIORITY);//minimum priority
        t1.start();
        System.out.println("t1 priority: "+t1.getPriority());
        t2.setPriority(Thread.NORM_PRIORITY);//normal priority
        t2.start();
        t1.join();
        System.out.println("t2 priority: "+t2.getPriority());
        t3.setPriority(Thread.MAX_PRIORITY);//max priority
        t3.start();
        System.out.println("t3 priority: "+t3.getPriority());
        //total time for executing
        long endTime= System.currentTimeMillis();
        System.out.printf(" total time for executing : %d",(endTime-startTime));

    }
}
