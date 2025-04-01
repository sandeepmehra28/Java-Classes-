package javaChallenges.StringClassesChalange.string.s;

//. Create an object with final fields and a constructor to initialize
//them.
class CarFinal{
    final int noOfWheels;
    final String model;
    final String engineInLiters;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("challenge.string.CarFinal{");
        sb.append("engineInLiters='").append(engineInLiters).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", noOfWheels=").append(noOfWheels);
        sb.append('}');
        return sb.toString();
    }

    public CarFinal(String engineInLiters, int noOfWheels, String model) {
        this.engineInLiters = engineInLiters;
        this.noOfWheels = noOfWheels;
        this.model = model;

    }
}
public class challenge8 {
    public static void main(String[] args) {
        CarFinal car1 = new CarFinal("6 liters",4,"2024");
        System.out.println(car1);
    }
}