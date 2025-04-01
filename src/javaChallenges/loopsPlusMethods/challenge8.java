package javaChallenges.loopsPlusMethods;
import java.util.Scanner;
//Create a program to check whether a given number is prime.
public class challenge8 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num= input.nextInt();
        boolean prime = isPrime(num);
        if(prime){
            System.out.println("your number is prime");
        }else {
            System.out.println("not prime");
        }
        System.out.println(input);
    }
    public  static  boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }

        }return true;
    }
}
