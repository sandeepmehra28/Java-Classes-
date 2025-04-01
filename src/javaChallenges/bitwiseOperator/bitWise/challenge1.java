package javaChallenges.bitwiseOperator.bitWise;
import  java.util.Scanner;
//Write a program to check if a given number is even or odd using
//bitwise operators.
public class challenge1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();
        if ((num&1) ==0){
            System.out.println("even");
        } else if ((num&1)==1) {
            System.out.println("odd");
        }

    }
}
