package javaCourseClasses.ExceptionHandling;

public class TemperatureException extends Exception{
    private final double degrees;

    public TemperatureException (double degrees){
        this.degrees=degrees;
    }

    public String  getMessage() {
        return "the temperature ("+ degrees +"C ) isn't in the normal range.";
    }

    public double getDegrees() {
        return degrees;
    }

    public static void main(String[] args) {
        TemperatureException te = new TemperatureException(99999.0);
        System.out.println(te.getDegrees());
        te.getMessage();
    }
}
