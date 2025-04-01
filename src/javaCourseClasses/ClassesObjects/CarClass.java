package javaCourseClasses.ClassesObjects;

public class CarClass {
     int noOfWeals;
     int noOfSeats;
     String color;
     int maxSpeed;
     float currentFuelInLiters;

     CarClass(){
         noOfSeats=4;
         color="white";
         maxSpeed=150;
         noOfWeals=4;
         currentFuelInLiters=2;
     }

     public void carProperties(){
         System.out.println("no. of tires in your car: "+noOfWeals);
         System.out.println("no. of seats in your car: "+noOfSeats);
         System.out.println("your car color is: "+color);
         System.out.println("max speed: "+maxSpeed+" KMPH");
     }

     public void drive(){
         if(currentFuelInLiters==0){
             System.out.println("car is out of fuel");
         } else if (currentFuelInLiters<5) {
             System.out.println("your car is in reserve mod, please refuel !");
             currentFuelInLiters--;

         }else {
             System.out.println("car is driving....");
             currentFuelInLiters--;
         }
     }
     public void addFuel(float fuel){

             currentFuelInLiters+=fuel;
             }
     public void getCurrentFuelInLiters(){
         System.out.println("current fuel in your car: "+currentFuelInLiters);
     }

}
