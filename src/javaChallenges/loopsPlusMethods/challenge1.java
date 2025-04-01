package javaChallenges.loopsPlusMethods;
import java.util.Scanner;
//Develop a program that prints the multiplication table for a given number
public class challenge1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num =  input.nextInt();
        for(int i =1;i<=10;i++){
            int pro = num*i;
            System.out.println(num + " x " + i + " = " + pro);
        }
    }
}
