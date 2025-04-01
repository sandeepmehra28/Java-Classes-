package javaChallenges.ifElse;
import  java.util.Scanner;
//8.Create a program that determines if a given year is a leap year
//(considering conditions like divisible by 4 but not 100, unless also
//divisible by 400).
public class challenge4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("leap year program");
        System.out.print("Enter your year: ");
        int year = input.nextInt();
        boolean  leapYear = (year%4==0&&year%100!=0)||year%400==0;
        if(leapYear){
            System.out.println("this is a leap year !");
        }else {
            System.out.println("this is not a leap year !");
        }
    }
}
