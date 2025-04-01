package javaChallenges.loopsPlusMethods;
import java.util.Scanner;
//Create a program to reverse the digits of a number.
public class challenge9 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();
        int revNum = RevNum(num);
        System.out.println(revNum);
    }
    public static int RevNum(int num){
        int reverseNumber = 0;
        while(num>0){
            int lastdigit = num%10;
            reverseNumber=reverseNumber*10+lastdigit;
            num/=10;
        }
        return reverseNumber;
    }
}
