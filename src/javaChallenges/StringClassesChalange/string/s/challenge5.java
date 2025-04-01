package javaChallenges.StringClassesChalange.string.s;

import java.util.Scanner;

public class challenge5 {
    public challenge5() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);

        int var2;
        double var3;
        do {
            System.out.print("guss the number between 1 to 10: ");
            var2 = var1.nextInt();
            double var5 = Math.random() * 10.0;
            var3 = (double)((int)Math.ceil(var5));
        } while((double)var2 != var3);

        System.out.println("you win...!");
    }
}
