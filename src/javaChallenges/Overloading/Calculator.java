package javaChallenges.Overloading;
//In a class Calculator, create multiple add() methods that
//overload each other and can sum two integers, three
//integers, or two doubles. Demonstrate how each can be
//called with different numbers of parameters.

// class
public class Calculator {
    //method with override
    public static int add(int num1, int num2){
        return num1+num2;
     }
     //method with override
     public  int add(int num1, int num2, int num3){
        return num1+num2+num3;
     }
     //method with override
     public    double add(double num1, double num2){
        return num1+num2;
     }

    public static void main(String[] args) {
        //object create
         Calculator Cal = new Calculator();
        System.out.println(Cal.add(5,10));
        System.out.println(Cal.add(5,10,5));
        System.out.println(Cal.add(5.0,5.0));
    }
}
