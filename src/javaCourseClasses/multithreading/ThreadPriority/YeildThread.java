package javaCourseClasses.multithreading.ThreadPriority;

import javax.imageio.stream.ImageInputStream;

public class YeildThread extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"is running");
            Thread.yield();
        }
    }

    public YeildThread(String name){
        super(name);
    }

    public static void main(String[] args) {
        YeildThread yt1 = new YeildThread("yt1");
        YeildThread yt2 = new YeildThread("yt2");
        yt1.start();
        yt2.start();
    }
}
