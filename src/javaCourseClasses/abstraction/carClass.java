package javaCourseClasses.abstraction;
//extends abstractVehicle class also this is a child class
public class carClass extends abstractClassVehicle{
    private int numberOfDoors;
    //getter
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
     //setter
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    // after extends abstract class and abstract class have constructor so must be initialized in the child class
    public carClass(){
         super(4);
     }
    // child class must be initialized the parent method otherwise JVM showing error.!
    @Override
    public void makeStartSound() {
        System.out.println("i am starting...");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("javaCourseClasses.abstraction.carClass{");
        sb.append("numberOfDoors=").append(getNumberOfDoors());
        sb.append(", numberOfTires=").append(getNumberOfTires());
        sb.append('}');
        return sb.toString();
    }
}
