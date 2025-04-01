//write a program in java to calculate factorial value of any number
package javaChallenges.practicalFile;
class Fact{
    public static int factorial(int number){
        if(number==0||number==1){
            return 1;
        }else {
            return number*factorial(number-1);
        }
    }
}
public class factorialClass {
    public static void main(String[] args) {
     int number  = 5;
     int result=Fact.factorial(number);
        System.out.println("Factorial of "+number+" is "+result);
    }
}
