package javaChallenges.ifElse;
import java.util.Scanner;
//.Create a program that determines if a number is positive, negative,
//or zero
public class challenge1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        if(num>0){
            System.out.println("your number is positive");
        } else if (num==0) {
            System.out.println("your number value is zero and it is also a positive!");
        }else {
            System.out.println("your number is nagative!");
        }
    }
}
