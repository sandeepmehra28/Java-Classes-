package javaChallenges.controlStatements;
//Create a program to find the minimum of two numbers
import java.util.Scanner;
public class challenge1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your first number: ");
        long num1 = input.nextLong();
        System.out.print("enter your second number: ");
        long num2 = input.nextLong();
        challenge1 minimum = new challenge1();
        long num =minimum.min(num1,num2);
        System.out.print("your minimum number is : "+num);
    }
    public long min(long num1, long num2){
        return num1<num2?num1:num2;
    }
}
