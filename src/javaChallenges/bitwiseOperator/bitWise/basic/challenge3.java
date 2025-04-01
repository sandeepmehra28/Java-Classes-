package javaChallenges.bitwiseOperator.bitWise.basic;
//Create a program to calculate Perimeter of a rectangle.
// Perimeter of rectangle ABCD = A+B+C+D

import java.util.Scanner;

class CalRectanglePar{
    static  int parameterCal(int a,int b,int c,int d){
        return a+b+c+d;
    }
}
public class challenge3 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter value for first side: ");
        int side1 = input.nextInt();
        System.out.print("Enter value for second side: ");
        int side2 = input.nextInt();
        System.out.print("Enter value for third side: ");
        int side3 = input.nextInt();
        System.out.print("Enter value for fourth side: ");
        int side4 = input.nextInt();
        int tot = CalRectanglePar.parameterCal(side1,side2,side3,side4);
        System.out.print("this is your total parimeter of a rectange: "+tot);
    }
}
