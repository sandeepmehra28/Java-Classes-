package javaChallenges.bitwiseOperator.bitWise.basic;
import java.util.Scanner;
//.Create a program to calculate the Area of a Triangle.
// Area of triangle = ½*B*H

//formula(Area = (base*height)/2
class CalArea{

    static int areaCal(int base,int height){
        return (base*height)/2;
    }
}
public class challenge4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your base: ");
        int base = input.nextInt();
        System.out.print("Enter your height: ");
        int height = input.nextInt();
        int cal = CalArea.areaCal(base,height);
        System.out.println("this is your area: "+cal);
    }
}
