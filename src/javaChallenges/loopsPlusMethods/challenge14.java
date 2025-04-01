package javaChallenges.loopsPlusMethods;

import java.util.Random;
import java.util.Scanner;

//60. Create a program using do-while to implement a number guessing game.
public class challenge14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num ;
        Random random = new Random();
        int num2 = random.nextInt(10);
        do {
            System.out.print("guessing number and enter your number (0 to 10) : ");
            num= input.nextInt();
            if(num2==num){
                System.out.println("you win...!");
                break;
            }
        }while (true);

    }


}
