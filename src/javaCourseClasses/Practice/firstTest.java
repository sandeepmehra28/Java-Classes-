package javaCourseClasses.Practice;
import java.util.Scanner;
public class firstTest {

    public static void main(String[] args) throws ArithmeticException{
        Scanner scanner =  new Scanner(System.in);
        System.out.print("enter first number: ");
        int number1  = scanner.nextInt();
        System.out.print("enter second number: ");
        int number2 = scanner.nextInt();
        try {
         int  sum = total(number1,number2);
        }catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
    }

    }
    public static int total(int numberX, int numberY) {

         return numberX/numberY;
    }

}
