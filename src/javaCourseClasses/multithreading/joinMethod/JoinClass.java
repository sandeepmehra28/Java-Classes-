package javaCourseClasses.multithreading.joinMethod;

public class JoinClass implements  Runnable{
    private final char tested;

    public JoinClass(char tested) {
        this.tested = tested;
    }

    @Override
    public void run() {
        for(int i = 1;i<=500;i++){
            System.out.printf("%c",tested);
            try{
                Thread.sleep(30);
            }catch (InterruptedException ie){
                System.out.println(ie);
            }
        }

    }
}
