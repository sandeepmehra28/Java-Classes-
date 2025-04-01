package javaChallenges.loopsPlusMethods;

import java.util.Scanner;

//Create a program using do-while to find password checker until a valid
//password is entered.
public class challenge13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        do {
            System.out.print("enter your valid Password out-off 8 characters: ");
            password=input.next();
        }while (!isVaildPassword(password));
        System.out.println("thanks for entering your password..!");
    }
    public static boolean isVaildPassword(String pass){
        return  pass.length()>8;
    }
}
