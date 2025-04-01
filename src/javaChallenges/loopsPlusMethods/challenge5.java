package javaChallenges.loopsPlusMethods;

import java.util.Scanner;

//Create a program that computes the sum of the digits of an integer.
public class challenge5 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
       int sum = 0;// storing total sum
       while (num>0){//check condition
           sum = sum+num%10; //num moduels by 10 and assign the sum
           num/=10;// num again mod by 10 and assign in num
       }
        System.out.println(sum);
    }
}
