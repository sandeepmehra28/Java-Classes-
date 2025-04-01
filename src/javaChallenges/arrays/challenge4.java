package javaChallenges.arrays;
import java.util.Scanner;
//Create a program to find the number of occurrences of an element in an
//array
public class challenge4 {
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
        for(int i=0;i< newArr.length;i++){
            if(newArr[i]==n){
                occ++;
            }
        }
       return occ;
    }
}
