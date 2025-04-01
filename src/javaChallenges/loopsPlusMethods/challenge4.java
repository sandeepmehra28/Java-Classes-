package javaChallenges.loopsPlusMethods;
//. Create a program that print patterns:
class first{
    void  starFirst(){
        for (int i = 0;i<5;i++){
            for(int j = 0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void starSecond(){
        for (int i = 0;i<5;i++){
            for(int j = 5;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void starthird(){
        for(int i=0;i<5;i++){
            for (int j = 5;j>i;j--){
                System.out.print(" ");
            }for (int k = 0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class challenge4 {
    public static void main(String[] args) {
        first star = new first();
        star.starFirst();
        System.out.println();
        star.starSecond();
        System.out.println();
        star.starthird();
    }
}
