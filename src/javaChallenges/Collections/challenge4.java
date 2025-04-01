package javaChallenges.Collections;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Write a method that swaps two elements in an ArrayList, given
//their indices.
public class challenge4 {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            System.out.println("this is your numbers in the List (1,2,3,4,5,6,7,8,9,10) ");
            System.out.print("enter your first index for swapping: ");
            int in1 = input.nextInt();
            System.out.print("enter your second second for swapping: ");
            int in2 = input.nextInt();
            List<Integer> List = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
            System.out.println("Before swapping: "+List);
            swap(List,in1,in2);
            System.out.println("after swapping: "+List);
        }catch (ArrayIndexOutOfBoundsException aiob){
            System.out.println("Array out of bound please enter index according your list");
        }
    }
    public static void swap( List<Integer> List,int x,int y){
      int swap = List.get(x);
      List.set(x,List.get(y));
      List.set(y,swap);
    }
}
