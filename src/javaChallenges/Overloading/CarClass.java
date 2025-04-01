package javaChallenges.Overloading;
//child class
public class CarClass extends Vehicle{
   //override method
    @Override
    public void service() {
        super.service();//calling super (parent class) method;
        System.out.println("car is getting  service..!");
    }
}
