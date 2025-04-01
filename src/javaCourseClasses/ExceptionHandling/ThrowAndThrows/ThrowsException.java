package javaCourseClasses.ExceptionHandling.ThrowAndThrows;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsException {
    public static void main(String[] args) throws FileNotFoundException {
    method1();
    }
    //throws the file not found exception to method 2
    public static void method1() throws FileNotFoundException {
        method2();
    }
   //throws file not found exception to method 3
    public static void method2() throws FileNotFoundException{
       method3();
     }
     //throws file not found exception
     public static void method3() throws FileNotFoundException {
         try {
             FileReader fileReader =new FileReader("a.txt");
         }catch (FileNotFoundException e){
             System.out.println("file not found..");
             //exceptions throw the object
             throw new FileNotFoundException("oops..");
         }
    }
}
