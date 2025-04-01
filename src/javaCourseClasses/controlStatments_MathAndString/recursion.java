package javaCourseClasses.controlStatments_MathAndString;

import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your number: ");
        int num =input.nextInt();
        long result = factorail(num);
        System.out.println("this is your output: "+result);
        long fact = fact(num);
        System.out.println("this is your fact method output: "+fact);
    }
    public static  long factorail(int num){// this is a recursion
        System.out.println("occ of number: "+num);
        if(num==1){
            return 1;
        }else {
            return num*factorail(num-1);
        }
    }
    public static long fact (int num){
       int result=1;
       for(int i=1;i<=num;i++){
           result*=i;
       }return result;
    }
}
