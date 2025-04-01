package javaChallenges.practicalFile;
//write a program to swap two number
public class swapNumber {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;
        int temp=0;
        System.out.printf("(before swapping)\n number1 = %d \n number2 = %d \n",number1,number2);
        temp=number1;
        number1=number2;
        number2=temp;
        System.out.printf("(after swapping)\n number1 = %d \n number2 = %d",number1,number2);
    }
}
