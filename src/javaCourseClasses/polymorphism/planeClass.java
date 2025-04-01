package javaCourseClasses.polymorphism;

public class planeClass implements vehicle{
    private int numberOfWheels;
    @Override
    //method
    public void start() {
        System.out.println("plane fly..");
    }
}
