package javaChallenges.Abstract;

public class CircleClass extends Shape{
    private double radiusInCm;

    public CircleClass(double radiusInCm) {
        this.radiusInCm = radiusInCm;
    }

    public double getRadiusInCm() {
        return radiusInCm;
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radiusInCm,2);
    }

}
