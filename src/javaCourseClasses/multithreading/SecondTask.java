package javaCourseClasses.multithreading;

public class SecondTask extends Thread{
    @Override
    public void run() {

        for (int i = 1; i <=1000 ; i++) {//second task
            System.out.printf("%d$ ",i);
        }
        System.out.printf("%s \n second task done !",Thread.currentThread().getName());
    }
}
