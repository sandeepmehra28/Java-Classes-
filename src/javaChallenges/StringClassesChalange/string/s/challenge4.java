package javaChallenges.StringClassesChalange.string.s;
//Simulate a dice roll using Math.random() and display the outcome
//(1 to 6).
class Dice{
    int roll(){
        double random = Math.random()*6;
        return  (int)Math.ceil(random);
    }
}
public class challenge4 {
    public static void main(String[] args) {
        Dice r1 = new Dice();
        System.out.println(r1.roll());

    }
}
