package javaChallenges.loopsPlusMethods;
import  java.util.Scanner;
//Create a program to find the Greatest Common Divisor (GCD) of two
//integers
public class challenge7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first value: ");
        int first = input.nextInt();
        System.out.print("Enter your second value: ");
        int second = input.nextInt();
        int GCDCAL= GCD(first,second);
        System.out.println(GCDCAL);
    }
    public  static  int GCD(int n,int s){
        int minVal = Math.min(n,s);
        int gcd = 1;
        for(int i=2;i<=minVal;i++){
            if(n%i==0 && s%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}
