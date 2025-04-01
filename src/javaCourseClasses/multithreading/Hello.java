package javaCourseClasses.multithreading;
class midium extends Thread{
    @Override
    public void run() {
        for(;;){
            System.out.println("?????");

        }
    }
}
public class Hello extends Thread {
    @Override
    public void run() {
        for(;;){
            System.out.println("hello");
           try{
               Thread.sleep(-100);//time out value nagitive
           }catch (InterruptedException | IllegalArgumentException e){
               System.out.println("InterruptedException and IllegalArgumentException Throw"+e);
           }
        }
    }
}

