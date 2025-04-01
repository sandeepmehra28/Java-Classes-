package javaCourseClasses.multithreading;




public class threadClass extends Thread{
    @Override
    public void run()   {
        for(int i = 0; i<=10000;i++){
            System.out.printf("%d:*",i);
           try{
               Thread.sleep(1000);
           }catch (InterruptedException e){
               System.out.println(e);
           }

        }
    }

    public void threadOne()throws InterruptedException{


    }
    public void threadtwo(){
        for(int i = 0; i<=10000;i++){
            System.out.printf("%d:*",i);
        }
    }
    public void threadthree(){
        for(int i = 0; i<=10000;i++){
            System.out.printf("%d:*",i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        threadClass tc = new threadClass();
        System.out.println(tc.getState());

        tc.run();


    }
}
