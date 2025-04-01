package javaCourseClasses.multithreading;

public class MiltithreadingClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FirstTask ft = new FirstTask();
        SecondTask st = new SecondTask();
        ThirdTask tt =new ThirdTask();
        System.out.println("\n starting first thread");
        ft.start();
        System.out.println("\n starting second thread");
        st.start();
        System.out.println("\n starting third thread");
        tt.start();
        long endTime = System.currentTimeMillis();
        System.out.printf("%s total time in: ",
                Thread.currentThread().getName(),
                (endTime-startTime));

    }
}
