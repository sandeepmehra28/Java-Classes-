package javaCourseClasses.multithreading.ThreadPriority;

public class priorityCLass implements Runnable{
     private final char tested;

    public priorityCLass(char tested) {
        this.tested = tested;
    }

    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            System.out.printf("%c ",tested);
            try{
                Thread.sleep(100);
            }catch (InterruptedException ie){
                System.out.println(ie);
            }
        }
        System.out.printf("%s",Thread.currentThread().getName());
    }
}
