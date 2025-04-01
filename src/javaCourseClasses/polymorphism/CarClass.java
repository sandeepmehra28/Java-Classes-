package javaCourseClasses.polymorphism;

public class CarClass implements vehicle{
    protected int numOfDoors;
    //method
    @Override
    public void start() {
        System.out.println("Car  starting...");
    }
}
