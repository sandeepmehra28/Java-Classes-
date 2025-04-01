package javaChallenges.loopsPlusMethods;

import java.util.Scanner;

//Create a program using break to read inputs from the user in a loop and break
//the loop if a specific keyword (like "exit") is entered.
public class challenge19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("enter your command: ");
            String command = input.next();
            if(command.equalsIgnoreCase("exit")){
                break;
            }
        }
        System.out.println( "you have successfully exit..!");
    }
}
