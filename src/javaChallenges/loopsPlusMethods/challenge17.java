package javaChallenges.loopsPlusMethods;

import javaChallenges.ArrayUtility;


//Create a program using for-each to find the maximum value in an integer array
public class challenge17 {
    public static void main(String[] args) {
        int [] arr = ArrayUtility.inputArr();
        int max = Integer.MIN_VALUE;
        for(int num:arr){
            if(max<num){
                max=num;
            }
        }
        System.out.println("our maximum number is: "+max);
    }
}
