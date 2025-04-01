package javaCourseClasses.ExceptionHandling.ThrowAndThrows;

import java.util.Scanner;

public class finallyClass {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int num1= input.nextInt();
        int num2 =input.nextInt();
       //outer try
        try {
            //inner try
            try{
                int restlt = num1/num2;
                System.out.println(restlt);
            }catch (Exception e){
                System.out.println("something caught..!");
            }finally {//finally
                System.out.println("not quit finally..");
            }
        }catch (ArithmeticException ex){
            System.out.println("Arithmetic Exception caught..");
        }finally {
            System.out.println("finally");
        }
    }
}
