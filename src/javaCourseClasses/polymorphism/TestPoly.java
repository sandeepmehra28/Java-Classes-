package javaCourseClasses.polymorphism;

public class TestPoly {
    public static void main(String[] args) {
    CarClass car = new CarClass();
    planeClass p = new planeClass();
    casting(car);
    casting(p);
    }
    public static void casting(vehicle v){
        v.start();

    }
}
