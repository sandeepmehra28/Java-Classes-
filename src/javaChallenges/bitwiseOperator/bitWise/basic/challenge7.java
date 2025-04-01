package javaChallenges.bitwiseOperator.bitWise.basic;
import java.util.Scanner;
//.Create a program to convert Fahrenheit to Celsius
// °C = (°F - 32) × 5/9
public class challenge7 {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        int F  = input.nextInt();
        int C = (F-32)*5/9;
        System.out.println("convert Fahrenheit to Celsius: "+C);
    }
}
