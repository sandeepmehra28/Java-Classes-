package javaChallenges.arrays;

import javaChallenges.ArrayUtility;

//Create a program to reverse an array
public class challenge8 {
    public static void main(String[] args) {
        System.out.println("Reverse the array");
        int[] myArr = ArrayUtility.inputArr();
        reverse(myArr);
        System.out.println("your reverse array is: ");
        ArrayUtility.displayArr(myArr);

    }

    public static void reverse(int[] myArr) {
        int i = 0;
        while (i < myArr.length / 2) {
            int swap = myArr[i];
            myArr[i] = myArr[(myArr.length - 1) - i];
            myArr[(myArr.length - 1) - i] = swap;
            i++;
        }
    }
}
