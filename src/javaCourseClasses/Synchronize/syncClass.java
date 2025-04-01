package javaCourseClasses.Synchronize;

public class syncClass extends Thread{
     private counter2 counter2;
    public syncClass(counter2 counter2){
         this.counter2=counter2;
     }

    @Override
    public void run() {
        for(int i = 0;i<1000;i++){
            counter2.increment();
        }
    }
}
