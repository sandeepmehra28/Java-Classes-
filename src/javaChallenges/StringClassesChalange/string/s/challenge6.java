package javaChallenges.StringClassesChalange.string.s;

import java.util.Scanner;

//. Create a number guessing game where the program selects a
//random number, and the user has to guess it.
public class challenge6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        double create;
        do {
            System.out.print("guss the number between 1 to 10: ");
            number=input.nextInt();
            double random = Math.random()*10;
            create=  (int)Math.ceil(random);

        }while (number!=create);
        System.out.println("you win...!");
    }
}