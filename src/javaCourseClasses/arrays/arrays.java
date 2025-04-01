package javaCourseClasses.arrays;
import java.util.Scanner;
public class arrays {
    public static boolean isFound(int [] arr,int num){
        for (int index = 0;index< arr.length;index++){
            if(arr[index]==num){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
         Scanner  input = new Scanner (System.in);
         int [] myArr = {12,13,14,15,16,17,18,19,20};
        System.out.print("Enter the number you found in this array: ");
         int num = input.nextInt();
         boolean isFound=isFound(myArr,num);
         if(isFound){
             System.out.println("your number was found in the array");
         }else {
             System.out.println("your number was not found  in the array");
         }
/**         declare array
        tow type of array
        first -
        int []  myarr = new int[6];
        myarr[1]=98;
        myarr[2]=97;
        myarr[3]=96;
        myarr[4]=95;
        myarr[5]=94;

        second-
        int [] myArr={1,2,3,3,4,4,56};
        for (int i:myarr){//array traversal
          System.out.println(i);
 */
    }
    }
    //    public static void main(String[] args) {
//        int [] marks = {90,91,92,93,94};
//        String [] name =
//        {"sandeep","sonu","chaman","sachin"};
//        float[] percentage = {93,34,77,88};
//        char [] grade = {'A','B','C','D'};
//
//
//        for(char i:grade){
//            System.out.println(i);
//        }
//   }
//}
