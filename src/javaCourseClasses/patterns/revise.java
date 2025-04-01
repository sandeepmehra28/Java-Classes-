package javaCourseClasses.patterns;

import java.util.Scanner;

class p {
    Scanner input= new Scanner(System.in);
    void star() {
        System.out.print("input your value: ");
        int n = input.nextInt();
        int sum = 1;
        for (int i=0;i<n;i++){
            for (int j =0;j<n;j++){
                System.out.print(sum+" ");
               sum++;
            }
            System.out.println();
        }
    }
    void starFirst(){
        System.out.print("input your value: ");
        int n = input.nextInt();
        int sum=1;
     for(int i = 0;i<n;i++){
         for(int j=0;j<i;j++){
             System.out.print(sum+" ");
             sum++;
         }
         System.out.println();
     }
    }
    void starSecond(){
        int sum=1;
        for(int i=0;i<5;i++){
            for(int j=4;j>i;j--){
                System.out.print(sum+" ");
            sum++;
            }
            System.out.println();
        }
    }
    void starThird(){
        System.out.print("enter your value: ");
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k= 0;k<i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
void starFourth(){
    System.out.print("Enter your value: ");
    int n = input.nextInt();
        for(int i=0; i<n;i++){
            for(int j = 0;j<i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=4;j>i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
}
void starFifth(){
        int ch  = 64;
        for(int i=0;i<5;i++){
            for(int j = 0;j<i;j++){
                System.out.print((char)ch);
            }
            System.out.println();
            ch++;
            }
       }
}
