package javaCourseClasses.controlStatments_MathAndString;

import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int out = num1>num2 ? num1:num2;//ternary operator  (short if -else ki calculation karne ke liye use karna
        // complex ke liye if-else hi use kare)
        System.out.println(out);
    }
}
