package javaChallenges.practicalFile;
//write a java program to display odd number form 1 to 100
public class DisplayOdd {
    public static void main(String[] args) {
       int n = 100;
        for (int i = 1; i <=n; i++) {
            if(i%2!=0){
                System.out.print(i +" ");
            }
        }
    }
}
