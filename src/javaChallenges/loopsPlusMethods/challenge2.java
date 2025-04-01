package javaChallenges.loopsPlusMethods;

import java.util.Scanner;

// Create a program to sum all odd numbers from 1 to a specified number N.
public class challenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        for (int i  =0;i<num;i++){
            if(num%2!=0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
