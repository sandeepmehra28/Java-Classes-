package javaCourseClasses.multithreading;

public class ThirdTask extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=1000 ; i++) {//third task
            System.out.printf("%d# ",i);
        }
        System.out.printf("%s \n third task done !",Thread.currentThread().getName());;
    }
}
