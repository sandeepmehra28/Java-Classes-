package javaChallenges.controlStatements;

import java.util.Scanner;

//Create a program to calculate the absolute value of a given
//integer.
public class challenge3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = input.nextInt();
        int result = num>0?num:-num;
        System.out.println("this is your result: "+result);
    }
}
