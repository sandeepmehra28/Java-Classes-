package javaChallenges.bitwiseOperator.bitWise.basic;
import java.util.Scanner;
//Create a program to calculate Compound interest.
// Compound Interest = P(1 + R/100)pow.t
class ComInt{
    static  double CalInt(int p,int r,int t){
        return (double) p * Math.pow((1+r/100),t);
    }
}
public class challenge6 {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         int p = input.nextInt();
         int r = input.nextInt();
         int t = input.nextInt();
         double interest = ComInt.CalInt(p,r,t);
        System.out.println(interest);
    }
}
