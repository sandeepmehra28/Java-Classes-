package javaCourseClasses.ExceptionHandling.ThrowAndThrows;

import org.w3c.dom.ls.LSOutput;

public class finallyExClass {
    public static void main(String[] args) {
        System.out.println(divide(5,0));
    }
    public  static  int divide(int a, int b){
       try{
           return a/b;
       }catch (ArithmeticException e){
           return -1;
       }finally {//finally, keyword always runs
           System.out.println("well done..");
       }

    }
}
