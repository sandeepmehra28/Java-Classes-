package javaCourseClasses.multithreading.myprogram;

public class printFirst implements Runnable{
    private final char testing;

    public printFirst(char testing) {
        this.testing = testing;
    }

    @Override
    public void run() {
        for(int i =0;i<1000;i++){
            System.out.printf("%c ",testing);
            try{
                Thread.sleep(100);
            }catch (InterruptedException ie){
                System.out.println("InterruptedException occurred: "+ie.getMessage());
            }
        }
    }
}
