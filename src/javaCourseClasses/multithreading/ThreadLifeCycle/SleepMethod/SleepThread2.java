package javaCourseClasses.multithreading.ThreadLifeCycle.SleepMethod;

public class SleepThread2 extends  Thread{
    private final char TestedChar;

    public SleepThread2(char testedChar) {
        TestedChar = testedChar;
    }

    @Override
    public void run() {
        for(int i = 1;i<=10;i++){
            System.out.printf("%d:%c",i,TestedChar);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ie){
                System.out.println("interrupted exception: "+ie);
            }
        }
        System.out.printf("%s task complete",Thread.currentThread().getName());
    }
}
