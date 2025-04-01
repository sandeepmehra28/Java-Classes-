package javaChallenges.controlStatements;

import java.util.Scanner;

//Create a program to Based on a student's score, categorize as
//"High", "Moderate", or "Low" using the ternary operator (e.g.,
//High for scores > 80, Moderate for 50-80, Low for < 50).
public class challenge4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();
        String result = marks>80?"high":(marks>50?"modrate":"low");
        System.out.println("this is your result: "+result);
    }
}
