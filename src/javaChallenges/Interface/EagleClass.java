package javaChallenges.Interface;

public class EagleClass extends BirdClass{

    public EagleClass() {
        super("EagleBreed");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }
}
