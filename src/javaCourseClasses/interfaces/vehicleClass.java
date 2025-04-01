package javaCourseClasses.interfaces;

public abstract class vehicleClass implements transpot{
    private int noOfTires;

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public vehicleClass(int noOfTires) {
        this.noOfTires = noOfTires;
    }
    public void info(){
        System.out.println(" i am a vehicle class..");
    }

}
