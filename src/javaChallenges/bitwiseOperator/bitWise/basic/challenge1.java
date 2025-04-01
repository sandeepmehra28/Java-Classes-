package javaChallenges.bitwiseOperator.bitWise.basic;
//8.Create a program that takes two numbers and shows result of all
//arithmetic operators (+,-,*,/,%).
import java.util.Scanner;
class Calculation{
    public static int add(int n1,  int n2){
        return n1+n2;
    }

    public static  int sub(int n1,int n2){
        return n1-n2;
    }
    public static  int mul(int n1,int n2){
        return n1 * n2;
    }
    public static  int  div(int n1 , int n2){
        return n1/n2;
    }
    public static  int modDiv (int n1,int n2){
        return n1%n2;
    }
}

public class challenge1 {
    public static void main(String[] args) {

            Scanner input=new Scanner(System.in);
            System.out.print("Enter your first value: ");
            int num1 = input.nextInt();
            System.out.print("Enter your second value: ");
            int num2 = input.nextInt();
            Calculation out = new Calculation();
            long addition = out.add(num1,num2);
            System.out.println("this is your output after addition: "+addition);
            int subtraction = out.sub(num1,num2);
            System.out.println("This is your output after subtraction: "+subtraction);
            long multiplication = out.mul(num1,num2);
            System.out.println("This is your output after multiplication: "+multiplication);
            double divide = out.div(num1,num2);
            System.out.println("This is your output after division: "+divide);
            int modulusdivide = out.modDiv(num1,num2);
            System.out.println("This is your output after modlus: "+modulusdivide);
        }
    }
