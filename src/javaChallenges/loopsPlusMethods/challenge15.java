package javaChallenges.loopsPlusMethods;

import java.util.Scanner;

//. Create a program using for loop multiplication table for a number.
public class challenge15 {
    public static void main(String[] args) {
        System.out.print("enter the table number you want: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num =0;
        for(int i = 1;i<=10;i++){
            num=n*i;
            System.out.println(n+" * "+ i +" = "+num);
        }
    }
}
