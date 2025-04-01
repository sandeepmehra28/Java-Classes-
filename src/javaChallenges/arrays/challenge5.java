package javaChallenges.arrays;
import javaChallenges.ArrayUtility;
//Create a program to find the maximum and minimum element in an
//array.
public class challenge5 {
    public static void main(String[] args) {
        System.out.println("find min or max value in array !");
        int [] myarr = ArrayUtility.inputArr();
        int min = findMin(myarr);
        int max = findMax(myarr);
        System.out.println("this is minimum value in this array: "+min);
        System.out.println("this is maximum value in this array: "+max);
    }
    public static  int findMax(int [] arr){
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int findMin(int [] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr.length){
                min=arr[i];
            }

        }
        return min;
    }

}
