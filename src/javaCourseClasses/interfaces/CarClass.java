package javaCourseClasses.interfaces;

public class CarClass extends vehicleClass{


        public CarClass() {
        super(4);
    }

    @Override
    public void going() {
        System.out.println("going to place..");
    }

    @Override
    public void makeStartSound() {
        System.out.println("vroom....");
    }
}
