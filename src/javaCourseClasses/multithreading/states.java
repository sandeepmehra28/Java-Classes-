package javaCourseClasses.multithreading;

public class states extends Thread{
    @Override
    public void run() {
        System.out.println("RUNNING");
            try{
                states.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
    }

    public static void main(String[] args) throws InterruptedException {
        states t1 = new states();//new state
        System.out.println(t1.getState());
        t1.start();// runnable state
        System.out.println(t1.getState());
        states.sleep(1000);//time waiting state
        System.out.println(t1.getState());
        t1.join();//terminated state
        System.out.println(t1.getState());
    }
}
