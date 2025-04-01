package javaCourseClasses.bitwise;
import java.util.Scanner;

class BitW{
    static int and(int first, int sec){
        return first & sec;
    }
    static  int Or(int first,int sec){
        return first|sec;
    }
    static  int Xor(int first,int sec){
        return first^sec;
    }
    static  int Not(int first){
        return ~first;
    }
    static  int LeftShift(int first){
        return first<<1;
    }
    static  int RightShift(int first){
        return first>>1;
    }
}
public class Bitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int first = input.nextByte();
        int sec = input.nextInt();
        int a = BitW.and(first,sec);
        System.out.println("using AND operator: "+a);
        int o = BitW.Or(first,sec);
        System.out.println("using OR operator: "+o);
        int X = BitW.Xor(first,sec);
        System.out.println("using Xor: "+X);
        int N = BitW.Not(first);
        System.out.println("not operator not use in program "+N);
        int LS = BitW.LeftShift(first);
        System.out.println(LS);
          int RS = BitW.RightShift(first);
        System.out.println(RS);
    }
}
