package javaChallenges.arrays;
import javaChallenges.ArrayUtility;
import java.util.Scanner;
//. Create a program to check if the given array is sorted.
public class challenge6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("shorting array !");
        int [] myArr = ArrayUtility.inputArr();
        boolean isInc = isIncreasing(myArr);
        boolean isDec = isDecreasing(myArr);
        if(isInc||isDec){
            System.out.println("your array is shorted");
        }else {
            System.out.println("your array is not shorted");
        }
    }
    public static boolean isIncreasing(int [] arr){
        for(int i =1;i< arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static  boolean isDecreasing(int [] arr){
        for(int i =1;i< arr.length;i++){
            if(arr[i]>arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
