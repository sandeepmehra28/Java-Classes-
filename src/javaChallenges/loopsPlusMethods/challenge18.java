package javaChallenges.loopsPlusMethods;

import java.util.Scanner;

//Create a program using for-each to the occurrences of a specific element in an
//array.
public class challenge18 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("find number of occurrences !");
        int [] myArr={1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10,11,11};
        System.out.print("Enter number you want find: ");
        int num =  input.nextInt();
        int occurrences = noOfOcc(myArr,num);
        System.out.println(occurrences+" times");
    }
    public static int noOfOcc(int[] newArr,int n){
        int occ = 0;
        for(int num:newArr){
            if(num==n){
                occ++;
            }
        }return occ;
    }
}
