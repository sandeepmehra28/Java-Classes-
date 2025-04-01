package javaCourseClasses.controlStatments_MathAndString;

import java.util.Scanner;

public class switchStatementsObject {
        public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            System.out.print("enter the day in numbers: ");
            Days d = new Days();
            int num = input.nextInt();
            d.we(num);
            System.out.println();
            Days1 d1 = new Days1();
            d1.we1(num);
        }
}