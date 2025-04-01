package javaChallenges.controlStatements;

import java.util.Scanner;

//Create a program to create a simple calculator that uses a
//switch statement to perform basic arithmetic operations
//like addition, subtraction, multiplication, and division.
public class challenge6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("enter your second number: ");
        int num2 = input.nextInt();
        System.out.println("now enter your operation using these symbols ( + , - , * , % , /)");
        System.out.print("enter: ");
        String ch = input.next();
        int result = switch (ch){
            case "+"-> num1+num2;
            case "-"->num1-num2;
            case "*"->num1*num2;
            case "%"->num1%num2;
            case "/"->num1/num2;
            default -> -1;
        };
        System.out.println("this is your result :"+result);
    }
}
