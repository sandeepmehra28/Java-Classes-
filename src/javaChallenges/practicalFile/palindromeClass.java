package javaChallenges.practicalFile;

// write a program to check number is the palindrom or not palindrom
public class palindromeClass {
    public static void main(String[] args) {
       int number  = 2345432;
       int originalNum = number;
       int revNum = 0;
       while (number!=0){
           int dig = number%10;
           revNum = revNum*10+dig;
           number/=10;
       }
       if(originalNum==revNum){
           System.out.println(originalNum+" : originalNumber is palindrom");
       }else{
           System.out.println(originalNum+" : originalNumber is not palindrom");
       }

    }

}
