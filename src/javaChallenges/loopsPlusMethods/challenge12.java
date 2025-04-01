package javaChallenges.loopsPlusMethods;
import java.util.Scanner;
//Create a program to verify if a number is a palindrome
public class challenge12 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter your number: ");
        int number = input.nextInt();
        boolean t = pali(number);
        if(t){
            System.out.println(number+" your number is palindrome");
        }else {
            System.out.println(number+" your number is not palindrome");
        }
    }
    public static boolean pali(int num){
        int orgNum = num;
        int reverseNum=0;
        while (num>0){
            int digit = num%10;
            reverseNum=reverseNum *10+digit;
            num /= 10;
        }
        return reverseNum==orgNum;

    }
}
