package javaChallenges.bitwiseOperator.bitWise.basic;

import java.util.Scanner;
//Create a program to calculate product of two floating points numbers
class Sum{
     public static float product(float n1 , float n2){
         return n1+n2;
     }
 }
public class challenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your first value: ");
        float num1 = input.nextFloat()  ;
        System.out.print("enter your second value: ");
        float num2 = input.nextFloat();
        float num  = Sum.product(num1,num2);
        System.out.println("this is your output: "+num);
    }
}
