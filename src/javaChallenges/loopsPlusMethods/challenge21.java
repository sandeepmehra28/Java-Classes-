package javaChallenges.loopsPlusMethods;

import java.util.Scanner;

//Create a program using continue to print only even numbers using continue for
//odd numbers.
public class challenge21 {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++){
            if(i%2==1){
                continue;
            }
            System.out.println(i);
        }
    }
}
