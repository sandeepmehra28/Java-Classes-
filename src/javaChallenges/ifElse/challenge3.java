package javaChallenges.ifElse;
import  java.util.Scanner;
//Create a program that determines the greatest of the three
//numbers.
public class challenge3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("greatest of the three number");
        System.out.print("Enter your first value: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second value: ");
        int num2 = input.nextInt();
        System.out.print("Enter your third value: ");
        int num3 = input.nextInt();
        if(num1>num2&&num1>num3){
            System.out.println("number first is  greatest ");
        }
        if(num2>num1&&num2>num3){
            System.out.println("number second is  greatest");
        }
        else{
            System.out.println("number third is greatest");
        }
    }
}
