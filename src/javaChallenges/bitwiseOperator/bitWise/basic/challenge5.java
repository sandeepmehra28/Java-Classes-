package javaChallenges.bitwiseOperator.bitWise.basic;
//Create a program to calculate simple interest.
// Simple Interest = (P x T x R)/100

import java.util.Scanner;

class calSimInt{
    static long simInt(int  p,int t,int r){
        return ((long) p *t*r)/100;
    }
}
public class challenge5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your principle: ");
        int pr = input.nextInt();
        System.out.println("Enter your time: ");
        int ye = input.nextInt();
        System.out.print("Enter your rate: ");
        int ra  = input.nextInt();
        calSimInt o = new calSimInt();
        long sI = o.simInt(pr,ye,ra);
        System.out.println("this is your simple intrest: "+sI);
    }
}
