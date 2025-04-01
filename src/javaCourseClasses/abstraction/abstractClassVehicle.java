package javaCourseClasses.abstraction;
// abstract class
public abstract class abstractClassVehicle {

   public abstract void makeStartSound();//declare abstract method
    private int numberOfTires;
    //getter
    public int getNumberOfTires() {
        return numberOfTires;
    }
    //setter
    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }
    //constructor
    public abstractClassVehicle(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }
    //method
    protected void working(){
        System.out.println("going...");
    }
}
