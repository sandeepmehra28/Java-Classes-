package javaChallenges.practicalFile;
// explain the interface in java with a suitable example
interface greeting{
    void greetMor();
    void greetEve();
    void greetNig();
}
class initial implements greeting{
    @Override
    public void greetMor() {
        System.out.println("good morning....");
    }
    @Override
    public void greetEve() {
        System.out.println("good evening....");
    }
    @Override
    public void greetNig() {
        System.out.println("good night....");
    }
}
public class interFace {
    public static void main(String[] args) {
        initial g1 = new initial();
        g1.greetMor();
        g1.greetEve();
        g1.greetNig();
    }
}
