package javaCourseClasses.multithreading.ThreadPriority;

import com.sun.security.jgss.GSSUtil;

public class SetDemon extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("hello world");
        }
    }

    public static void main(String... args) {
        SetDemon sd = new SetDemon();
        sd.setDaemon(true);
        SetDemon sd2 = new SetDemon();
        sd2.start();
        sd.start();
        sd2.setDaemon(true);
        System.out.println("main thread ");

    }
}
