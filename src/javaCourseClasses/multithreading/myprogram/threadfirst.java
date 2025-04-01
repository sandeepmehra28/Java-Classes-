package javaCourseClasses.multithreading.myprogram;

public class threadfirst implements Runnable{
    private final char tested1;

    public threadfirst(char tested) {
        this.tested1 = tested;
    }

    @Override
    public void run() {
        for(int i =0;i<1000;i++){
            System.out.printf("%c ",tested1);
            try{
                Thread.sleep(200);
            }catch (InterruptedException ie){
                System.out.println(ie.getMessage());
            }
        }
    }
}
