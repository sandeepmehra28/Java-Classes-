package javaChallenges.arrays;
//find value an array
import java.util.Scanner;
class Found{
    public  static  boolean isFound(int[] arr,int num){
        for(int index=0;index < arr.length;index++){//array traversal
            if(arr[index]==num){
                return true;
            }
        }
        return false;
    }
}
public class challenge1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int [] arr={1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90,100,1100};
        System.out.print("Enter which number do you find: ");
        int num = input.nextInt();
        boolean isFound = Found.isFound(arr, num);
        if(isFound){
            System.out.println("your number was found in the array");
        }else{
            System.out.println("your number was not found in the array");
        }
    }
}











//package challenge.javaChallenges.arrays;
//    //find  value in array
//
//import java.util.Scanner;
//class Found{
//    public  static  boolean isFound(int[] arr,int num){
//        for(int index=0;index < arr.length;index++){//array traversal
//            if(arr[index]==num){
//                return true;
//            }
//        }
//        return false;
//    }
//}
//
//public class challenge1 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int [] arr={1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90,100,1100};
//        System.out.print("Enter which number do you find: ");
//        int num = input.nextInt();
//        boolean isFound = Found.isFound(arr, num);
//        if(isFound){
//            System.out.println("your number was found in the array");
//        }else{
//            System.out.println("your number was not found in the array");
//        }
//    }
//}