package in.javaLearn;

public class accessTest  {
    public static void main(String[] args) {

        Car Car1 = new Car();
        Car1.color="blue";
        Car1.model="bmw";
        Car1.noOfWheels=4;
        Car Car2 = new Car("red",50000,4,"BMW",4);
        System.out.println(Car1);
        System.out.println(Car2);
    }
}
