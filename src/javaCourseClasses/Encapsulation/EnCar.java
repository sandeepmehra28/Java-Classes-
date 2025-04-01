package javaCourseClasses.Encapsulation;
//encapsulation
 class EnCar {
    public int numberOfWheels;
    public String carColor;
    public String carModel;
    private long purchagePrice;
    private double fuelLevel;

    public EnCar() {
    }

    public EnCar(String carColor, double fuelLevel, int numberOfWheels, long purchagePrice,String carModel) {
        this.carColor = carColor;
        this.fuelLevel = fuelLevel;
        this.numberOfWheels = numberOfWheels;
        this.purchagePrice = purchagePrice;
        this.carModel=carModel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("javaCourseClasses.Encapsulation.EnCar{");
        sb.append("carColor='").append(carColor).append('\'');
        sb.append(", carModel='").append(carModel).append('\'');
        sb.append(", fuelLevel=").append(fuelLevel);
        sb.append(", numberOfWheels=").append(numberOfWheels);
        sb.append(", purchagePrice=").append(purchagePrice);
        sb.append('}');
        return sb.toString();
    }
}
