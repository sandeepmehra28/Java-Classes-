package javaChallenges.loopsPlusMethods;
import java.util.Scanner;
//Create a program to print the Fibonacci series up to a certain number
public class challenge10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        int FibSer = FS(num);
        System.out.print(FibSer);
    }

    public  static int FS(int num){
        if(num<0) return num;
        System.out.print("0 ");
        if(num==0) return num;
        System.out.print("1 ");
        int first = 0,second=1;
        while(first+second<num){
            int third = first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
        }
        return num;
    }
}
