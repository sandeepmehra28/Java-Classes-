package javaChallenges.ifElse;
import java.util.Scanner;
//Create a program that determines if a number is odd or even.
public class challenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("number is even or odd");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("your number is even !");
        }else{
            System.out.println("your number is odd !");
        }
    }
}
