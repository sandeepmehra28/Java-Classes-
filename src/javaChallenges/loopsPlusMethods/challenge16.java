package javaChallenges.loopsPlusMethods;

import java.util.Scanner;

//Create a program using for to display if a number is prime or not.
public class challenge16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = input.nextInt();
        System.out.println("your number is "+(isPrime(num)?"prime":"not prime"));
    }
    public static boolean isPrime(int num){
        for(int i = 2;i<num;i++){
            if(num%i==0){
                return false;

            }
            }
        return true;
        }
    }

