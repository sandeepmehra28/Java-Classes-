package javaCourseClasses.multithreading.runnableInerface;

public class printTask implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.printf("%d:%c",i,targetChar);
        }
        System.out.printf("\n%s printTask done: ",Thread.currentThread().getName());
    }

    private final char targetChar;
    public printTask(char targetChar) {
        this.targetChar = targetChar;
    }
}
