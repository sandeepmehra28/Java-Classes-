package javaChallenges.loopsPlusMethods;

import javaChallenges.ArrayUtility;

//Create a program using continue to sum all positive numbers entered by the
//user; skip any negative numbers.
public class challenge20 {
    public static void main(String[] args) {
        int [] arr = ArrayUtility.inputArr();
        int sum=0;
        for(int num:arr){
            if(num<0){
                continue;
            }sum+=num;
        }
        System.out.println("the sum of positive number: "+sum);
    }
}
