package javaChallenges.loopsPlusMethods;
import java.util.Scanner;
//Create a program to check if a number is an Armstrong number
public class challenge11 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int number=input.nextInt();
        boolean An = ArmNum(number);
        if(An){
            System.out.println("your number is Armstrong number");
        }else{
            System.out.println("your number is not a Armstrong number");
        }
    }
    public static boolean ArmNum(int num){
        int noDigits = noOfDigits(num);
        int numCopy=num;
        int finalNO = 0;
        while(num>0){
            int lastDigits = num%10;
            num/=10;
            finalNO+=pow(lastDigits,noDigits);
        }
        return finalNO==numCopy;

    }
    public static int pow(int a ,int b){
        int result = 1;
        for(int i=0;i<b;i++){
            result*=a;
        }
        return result;
    }
    public static int noOfDigits(int num){
        int sum=0;
        while(num>0){
            sum++;
            num/=10;
        }
        return sum;
    }
}
