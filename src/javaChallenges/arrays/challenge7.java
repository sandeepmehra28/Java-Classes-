package javaChallenges.arrays;
import javaChallenges.ArrayUtility;

import java.util.Scanner;

//Create a program to return a new array deleting a specific element.
public class challenge7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("deleting specific element in the array");
        int [] myArr= ArrayUtility.inputArr();
        System.out.print("enter then you want to delete: ");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNo(myArr,numToDelete);
        System.out.println("this is your new array" );
        ArrayUtility.displayArr(newArr);

    }
    public static  int[] deleteNo(int[] numArr, int numToDelete){
        int occ = challenge4.noOfOcc(numArr,numToDelete);
        if(occ==0){
            return numArr;
        }
        int newSize = numArr.length-occ;
        int [] newArr = new int[newSize];
        int j=0;
        for (int i = 0;i<newArr.length;i++){
            if(numArr[i]!=numToDelete){
                newArr[j]=numArr[i];
                j++;
            }
        }
        return newArr;
    }
}