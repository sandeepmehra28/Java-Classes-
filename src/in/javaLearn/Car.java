package in.javaLearn;
//Access modifier
public class Car {
    public String color;
    public String model;
    private double fuelLevel;
    private long costOfPurchage;
    int noOfWheels;//this is a default modifier and access only the same package

    public Car() {
    }

    public Car(String color, long costOfPurchage, double fuelLevel, String model,int noOfWheels) {
        this.color = color;
        this.costOfPurchage = costOfPurchage;
        this.fuelLevel = fuelLevel;
        this.model = model;
        this.noOfWheels=noOfWheels;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("in.javaLearn.Car{");
        sb.append("color='").append(color).append('\'');
        sb.append(", costOfPurchage=").append(costOfPurchage);
        sb.append(", fuelLevel=").append(fuelLevel);
        sb.append(", model='").append(model).append('\'');
        sb.append(", noOfWheels=").append(noOfWheels);
        sb.append('}');
        return sb.toString();
    }
}
