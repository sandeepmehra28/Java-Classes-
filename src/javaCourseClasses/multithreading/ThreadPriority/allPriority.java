package javaCourseClasses.multithreading.ThreadPriority;

public class allPriority extends Thread{
    // Method 1
    // run() method for the thread that is called
    // as soon as start() is invoked for thread in main()
    public void run()
    {
        // Print statement
        System.out.println("Inside run method");
    }
    // Main driver method
    public static void main(String[] args)
    {
        // Creating random threads
        // with the help of the above class
        allPriority t1 = new allPriority();
        allPriority t2 = new allPriority();
        allPriority t3 = new allPriority();

        // Thread 1
        // Display the priority of above thread
        // using getPriority() method
        System.out.println("t1 thread priority : "
                + t1.getPriority());

        // Thread 1
        // Display the priority of the above thread
        System.out.println("t2 thread priority : "
                + t2.getPriority());

        // Thread 3
        System.out.println("t3 thread priority : "
                + t3.getPriority());

        // Setting priorities of the above threads by
        // passing integer arguments
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);

        // t3.setPriority(21); will throw
        // IllegalArgumentException

        // 2
        System.out.println("t1 thread priority : "
                + t1.getPriority());

        // 5
        System.out.println("t2 thread priority : "
                + t2.getPriority());

        // 8
        System.out.println("t3 thread priority : "
                + t3.getPriority());

        // Main thread

        // Displays the name of
        // currently executing Thread
        System.out.println(
                "Currently Executing Thread : "
                        + Thread.currentThread().getName());

        System.out.println(
                "Main thread priority : "
                        + Thread.currentThread().getPriority());

        // Main thread priority is set to 10
        Thread.currentThread().setPriority(10);

        System.out.println(
                "Main thread priority : "
                        + Thread.currentThread().getPriority());
    }
}
