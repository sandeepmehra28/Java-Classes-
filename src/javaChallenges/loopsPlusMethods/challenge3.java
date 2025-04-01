package javaChallenges.loopsPlusMethods;
import java.util.Scanner;
//Write a function that calculates the factorial of a given number.
class fact{
    static int factorial(int n){
        if(n==0){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }
}
public class challenge3 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
     int num = input.nextInt();
        System.out.println(fact.factorial(num));
    }
}
