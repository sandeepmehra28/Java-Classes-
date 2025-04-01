package javaChallenges.ExceptionsChallenges;

import java.util.Scanner;

//Arithmetic Exception Handling
//Write a program that asks the user to enter two integers and
//then divides the first by the second. The program should
//handle any arithmetic exceptions that may occur (like
//division by zero) and display an appropriate message.
//Key Points:
//• Use Scanner to read user input.
//• Implement a try-catch block to handle ArithmeticException.
//• Display a user-friendly message if division by zero occurs.
public class challenge1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first value: ");
        int first = input.nextInt();
        System.out.print("enter second value: ");
        int second = input.nextInt();
        try{
            int result = first/second;
            System.out.println("your result is : "+result);
        }catch (ArithmeticException exception){
            if(exception.getMessage().equals("/ by zero")){
                System.out.println("division by zero occurs");
            }else{
                throw exception;
            }

        }
        finally {
            System.out.println("i am finally..");
        }
    }
}
