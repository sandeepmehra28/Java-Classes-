package javaChallenges;

import java.util.Scanner;


public class ArrayUtility {
    public static String[] inputArrString() {//According to your  purpose  you can modify;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the subjects in number of the array: ");
        int size = input.nextInt();
        String[] arr = new String[size];
        System.out.println("enter the subjects names of the array: ");
        for(int i =0;i<size;i++){
            System.out.print("enter subject in index "+ i +" :");
            arr[i]=input.next();
        }
        return arr;
    }
    public static int[] inputArr() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements of the array: ");
        for(int i =0;i<size;i++){
            System.out.print("enter elements in index "+ i +" :");
            arr[i]=input.nextInt();
        }
        return arr;
    }
    public static void displayArr(int [] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static  void input2DArr(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter your rows: ");
        int row = input.nextInt();
        System.out.print("enter your columns");
        int col = input.nextInt();
        int [][] myArr = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j = 0; j<col;j++){
                myArr[i][j]=input.nextInt();
            }
            System.out.println();
        }
    }
}
