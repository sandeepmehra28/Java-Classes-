package javaChallenges.StringClassesChalange.string.s;

import java.util.Scanner;

// Calculate the area and circumference of a circle for a given radius
//using Math.PI
// double area = Math.PI * Math.pow(radius, 2);
//        double circumference = 2 * Math.PI * radius;
public class challenge3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the radius: ");
        double radius = input.nextDouble();
        double area = Math.PI*Math.pow(radius,2);
        double circumferences = 2*Math.PI*radius;
        System.out.printf("this is your area: %f\nthis is your circumferences: %f",area,circumferences);
    }
}
