package javaCourseClasses.Encapsulation;

public class EnCarTest {
    public static void main(String[] args) {
        EnCar car1 = new EnCar();
        car1.carColor="red";
        car1.carModel="honda";
        car1.numberOfWheels=4;
        System.out.println(car1);
        EnCar car2 = new EnCar("blue",5,4,50000,"BMW");
        System.out.println(car2);
    }
}
