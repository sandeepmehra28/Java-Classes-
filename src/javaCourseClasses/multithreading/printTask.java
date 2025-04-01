package javaCourseClasses.multithreading;

public class printTask extends Thread{

    @Override
    public void run() {
        //loop
        for(int i=1;i<=1000;i++){
            System.out.printf("%d:%c",i,targetChar);
            try{
                Thread.sleep(1000);//sleep timer

            }
            //exception handling
            catch (InterruptedException ie){
                System.out.println(ie);
            }
        }
        System.out.printf("\n%c task done\n",targetChar);
    }
    // final variable
    private final char targetChar;
    // constructor
    public printTask(char targetChar) {
        this.targetChar = targetChar;
    }


    public static void main(String[] args) {
      printTask p1 =new printTask('^');// object of printTask class
      p1.start();//start print class
    }
}
