package javaChallenges.arrays;
import javaChallenges.ArrayUtility;
class challenge3 {
      private static int size ;

    public static void main(String[] args) {
        int [] myArr = ArrayUtility.inputArr();
        int sum=0;
        for(int num:myArr){
            sum+=num;
        }
        double sizeA = (double) sum/size;
        System.out.println("this is your average: "+sizeA);
        System.out.println("this is your sum: "+sum);
    }
}
