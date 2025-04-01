package javaChallenges.ifElse;
import  java.util.Scanner;
//.Create a program that calculates grades based on marks
//A -> above 90% B -> above 75%
//C -> above 60% D -> above 30%
//F -> below 30%
public class challenge5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your first subject number: ");
        int num1 = input.nextInt();
        System.out.print("enter your second subject number: ");
        int num2 = input.nextInt();
        System.out.print("enter your third subject number: ");
        int num3 = input.nextInt();
        System.out.print("enter your forth subject number: ");
        int num4 = input.nextInt();
        System.out.print("enter your fifth subject number: ");
        int num5 = input.nextInt();
        System.out.print("enter your sixth subject number: ");
        int num6 = input.nextInt();
        int tot = num1 + num2 + num3 + num4 + num5 + num6;
        if (tot < 600 && tot > 0) {
            System.out.println("your total marks is : " + tot);
        float per = ((float) tot / 600) * 100;
        System.out.println("this is your percentage: " + per + "%");
        if (per >= 90 && per <= 100) {
            System.out.println("Your grade: " + "A");
        } else if (per >= 75 && per < 90) {
            System.out.println("Your grade: " + "B");
        } else if (per >= 60 && per < 75) {
            System.out.println("Your grade: " + "C");
        } else if (per >= 30 && per < 60) {
            System.out.println("Your grade: " + "D");
        } else if (per < 30 && per > 1) {
            System.out.println("Your grade: " + "F");
        }
    }else {
            System.out.println("Wrong entry ! \nplease check your subjects number");
        }
    }
}
