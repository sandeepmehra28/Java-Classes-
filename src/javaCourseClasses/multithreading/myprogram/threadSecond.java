package javaCourseClasses.multithreading.myprogram;

public class threadSecond implements Runnable{
    private final char tested2;

    public threadSecond(char tested2) {
        this.tested2 = tested2;
    }

    @Override
    public void run() {
        for(int i =0;i<1000;i++){
            System.out.printf("%c",tested2);
            try{
                Thread.sleep(200);
            }catch (InterruptedException ie){
                System.out.println(ie.getMessage());
            }
        }
    }
}
