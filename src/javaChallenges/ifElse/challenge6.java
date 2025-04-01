package javaChallenges.ifElse;
import  java.util.Scanner;
//.Create a program that categorize a person into different age groups
//Child -> below 13 Teen -> below 20
//Adult -> below 60 Senior-> above 60
public class challenge6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("categorize age program !");
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if(age<=100&&age>0){
            if(age<=13&&age>=1){
                System.out.println("you are child");
            } else if (age>13&&age<=20) {
                System.out.println("you are teen");
            } else if (age>20&&age<=60) {
                System.out.println("your are adult");
            } else if (age>60&&age<=100) {
                System.out.println("you are senior");
            }
        }else {
            System.out.println("this program are not able to categorize your age !");
        }
    }
}
