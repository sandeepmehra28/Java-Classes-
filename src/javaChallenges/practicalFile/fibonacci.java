package javaChallenges.practicalFile;
// write a program in java to print fibonacci 0,1,1,2,3,5,8,13.....n
public class fibonacci {
    public static void main(String[] args) {
     int number = 10;
        for(int i = 1 ;i<=number;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
    public static  int fibonacci( int num){
        if(num==1){
            return 0;
        }
        if(num==2){
            return 1;
        }
        return fibonacci(num-1)+fibonacci(num-2);
    }
}
