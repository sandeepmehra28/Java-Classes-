package javaChallenges.loopsPlusMethods;
import  java.util.Scanner;
//Create a program to find the Least Common Multiple (LCM) of two
//numbers.
public class challenge6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first value: ");
        int first = input.nextInt();
        System.out.print("Enter your second value: ");
        int second = input.nextInt();
        int lcm = MulLcm(first,second);
        System.out.println("this is your final answer: "+lcm);
    }
    public static  int MulLcm(int f,int s){
        int i = 1;
        while (true) {
            int factor = f * i;
            if(factor%s==0){
                return factor;
            }
            i++;
        }
        }
}
