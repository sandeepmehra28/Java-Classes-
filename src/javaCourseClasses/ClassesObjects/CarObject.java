package javaCourseClasses.ClassesObjects;

public class CarObject {
    public static void main(String[] args) {
       CarClass swift = new CarClass();
       swift.color="blue";
       swift.noOfSeats=2;
       swift.carProperties();
       swift.addFuel(6);
       swift.drive();
       swift.drive();
       swift.getCurrentFuelInLiters();
    }
}
