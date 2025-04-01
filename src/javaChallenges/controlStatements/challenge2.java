package javaChallenges.controlStatements;

import java.util.Scanner;

//Create a program to find if the given number is even or odd
public class challenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        challenge2 t = new challenge2();
        String result = num%2==0?"even":"odd";
        System.out.print("your number is : "+result);
    }
}
