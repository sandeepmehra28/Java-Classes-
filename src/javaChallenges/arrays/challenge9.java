package javaChallenges.arrays;

import javaChallenges.ArrayUtility;

//Create a program to check is the array is palindrome or not.
public class challenge9 {
    public static void main(String[] args) {
        int[] myArr = ArrayUtility.inputArr();
        boolean outputOf = isPalindrom(myArr);
        if (outputOf) {
            System.out.println("your number is palindrom");
        } else {
            System.out.println("your number is not palindrom");
        }
    }
    public static boolean isPalindrom(int[] myArr) {
        for(int i =0 ;i<myArr.length/2;i++){
            if(myArr[i] != myArr[myArr.length-1-i]){
                return false;
            }
        }
        return true;
    }

}
