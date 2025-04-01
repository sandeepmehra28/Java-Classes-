package javaChallenges.controlStatements;

import java.util.Scanner;

//Create a program to print the month of the year based on a
//number (1-12) input by the user
public class challenge5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the month in numbers: ");
        int month = input.nextInt();
        String out = switch (month){
            case 1 ->"january";
            case 2 ->"february";
            case 3 ->"march";
            case 4 ->"april";
            case 5 ->"may";
            case 6 ->"june";
            case 7 ->"july";
            case 8 ->"august";
            case 9 ->"september";
            case 10 ->"october";
            case 11 ->"november";
            case 12 ->"december";
            default -> "invaild";
        };
        System.out.println("your month is : "+out);
    }
}
