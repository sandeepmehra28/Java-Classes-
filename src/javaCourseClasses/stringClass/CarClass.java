package javaCourseClasses.stringClass;

//toString
public class CarClass {
    int noOfDoors;
    int noOfWheels;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;


    public CarClass(String company, int maxSpeed, String modelNumber, String name, int noOfDoors, int noOfWheels) {
        this.company = company;
        this.maxSpeed = maxSpeed;
        this.modelNumber = modelNumber;
        this.name = name;
        this.noOfDoors = noOfDoors;
        this.noOfWheels = noOfWheels;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("javaCourse.stringClass.CarClass{");
        sb.append("company='").append(company).append('\'');
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", modelNumber='").append(modelNumber).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", noOfDoors=").append(noOfDoors);
        sb.append(", noOfWheels=").append(noOfWheels);
        sb.append('}');
        return sb.toString();
    }
}
