package javaCourseClasses.multithreading;

public class FirstTask  extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=1000 ; i++) {//first task
            System.out.printf("%d* ",i);
        }
        System.out.printf("%s \n first task done !",Thread.currentThread().getName());
    }
}
