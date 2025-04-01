package javaChallenges.arrays;
////found name in the array
import java.util.Scanner;
class foundName{
    public static boolean isFound(String [] na,String n){
        for(int index=0;index< na.length;index++){
            if(na[index].equals(n)){// .equals() used only string
                return true;
            }
        }
        return false;
    }
}
public class challenge2 {
        public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] nameArr ={"sandeep","sonu","sachin","chaman","dilip"};
        System.out.print("Enter which name you found: ");
        String name = input.nextLine();
        boolean isFound = foundName.isFound(nameArr,name);
        if(isFound){
            System.out.println("your name was found in the array");
        }else {
            System.out.println("your name was not found in the array");
        }
    }
}
