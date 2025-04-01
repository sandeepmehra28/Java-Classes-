package javaChallenges.Abstract;

public class SquareClass extends Shape{
    private final  double sideInCm;

    public SquareClass(double sideInCm) {
        this.sideInCm = sideInCm;
    }

    public double getSideInCm() {
        return sideInCm;
    }

    @Override
    public double calculateArea() {
    return Math.pow(sideInCm,2);
    }
}
