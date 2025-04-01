package javaChallenges.practicalFile;
//write a java program to find the largest value among three value
public class largestValue {
    public static void main(String[] args) {
        int num1= 5;
        int num2 = 10;
        int num3 = 15;
        if(num1>num2&&num1>num3){
            System.out.println(" num1 is larger");
        } else if (num2>num1&&num2>num3) {
            System.out.println(" num2 is larger");
        }else {
            System.out.println(" num3 is larger");
        }
    }
}
