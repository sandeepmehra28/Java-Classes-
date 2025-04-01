package javaCourseClasses.multithreading.myprogram;

public class printSecond implements Runnable{
    private final char tested2;

    public printSecond(char tested2) {
        this.tested2 = tested2;
    }

    @Override
    public void run() {
         for(int i =0;i<1000;i++){
             System.out.printf("%c ",tested2);
             try{
                 Thread.sleep(300);
             }catch (InterruptedException ie){
                 System.out.println("InterruptedException occurred: "+ie.getMessage());
             }
         }
    }
}
