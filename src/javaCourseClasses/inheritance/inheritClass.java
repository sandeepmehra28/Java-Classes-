package javaCourseClasses.inheritance;

public class inheritClass {
    public static void main(String[] args) {
    vehicleClass v = new vehicleClass();
       v.setNumberOfTires(2);
       v.setName("vehicle");
        System.out.println(v.hashCode());
        System.out.println(v.toString());
        System.out.println(v.getClass());


    twowheeler t =new twowheeler();
    t.setName("twoWheeler");
        t.setNumberOfTires(3);
        System.out.println(t.numberOfTires);
        t.balance();
        System.out.println(t.toString());
        System.out.println(t.getClass());
    }
}
