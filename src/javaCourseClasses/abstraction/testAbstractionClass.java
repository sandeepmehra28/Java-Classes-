package javaCourseClasses.abstraction;

public class testAbstractionClass {
    public static void main(String[] args) {
        carClass c = new carClass();//create object
        c.working();//method call
        c.makeStartSound();//method call
        c.setNumberOfTires(4);
        System.out.println(c.getNumberOfTires());
        c.setNumberOfDoors(2);
        System.out.println(c.getNumberOfDoors()+"\n"+c.toString());
    }
}
