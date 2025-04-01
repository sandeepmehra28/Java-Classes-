package javaCourseClasses.inheritance;

public class vehicleClass {
    private String name;
    protected    int numberOfTires;

    public void setName(String name){
        this.name=name;
    }

    public void setNumberOfTires(int numberOfTires){
        this.numberOfTires=numberOfTires;
    }
    public void commute(){
        System.out.println("i ama a vehicle class..!");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("javaCourseClasses.inheritance.vehicleClass{");
        sb.append("name='").append(name).append('\'');
        sb.append(", numberOfTires=").append(numberOfTires);
        sb.append('}');
        return sb.toString();
    }
}
