package javaChallenges.loopsPlusMethods;

import java.util.Scanner;

//Create a program using recursion to display the Fibonacci series upto a certain
//number.
public class challenge22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of element to be printed: ");
        int count = input.nextInt();
        for(int i = 1 ;i<=count;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
    public static  int fibonacci( int position){
        if(position==1){
            return 0;
        }
        if(position==2){
            return 1;
        }
        return fibonacci(position-1)+fibonacci(position-2);
    }
}
