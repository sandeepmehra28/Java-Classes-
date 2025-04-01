package javaCourseClasses.ExceptionHandling.ThrowAndThrows;

import java.util.Scanner;
// exception stack flow
public class ExceptionStack {
    //method
    public static void a(){
        //calling b() method
        b();
    }
    //method
    public static void b(){
        //calling c() method
        c();
    }
    //method
    public static void c(){
       //calling d() method
        d();
    }
    //method
    public static void d(){
     //calling e() method
      e();
    }
    //method
    public static void e(){
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n4 = n1/n2;
        System.out.println(n4);

//handle the exception using try and catch
//        try{
//            int n3 = n1/n2;
//            System.out.println(n3);
//        }catch (ArrayIndexOutOfBoundsException ex){
//            System.out.printf(" %s enter valid values ",ex.getMessage());
//        }
    }
   //main method
    public static void main(String[] args) {
        //calling a() method
        a();

    }

}
