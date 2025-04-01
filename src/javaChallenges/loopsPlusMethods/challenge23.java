package javaChallenges.loopsPlusMethods;

import java.util.Scanner;

//Create a program using recursion to check if a string is a palindrome using
//recursion.
public class challenge23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the string to be checked: ");
        String str = input.next();
        System.out.println("your String is "+(isPalindrome(str)?"palindrome":"not palindrome"));
    }
    public static  boolean isPalindrome(String str){
        if(str.length()<=1){
            return true;
        }
        int lastPos=str.length()-1;
            if(str.charAt(0)!=str.charAt(lastPos)){
                return false;
            }
            String newStr = str.substring(1,lastPos);

        return isPalindrome(newStr);
    }
}
