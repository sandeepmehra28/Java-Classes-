package javaCourseClasses.constructor;

 class Car{
     String name;
     String color;
     int numOfSeats;
     int numOfTiers;
     Car(){// when user can't assign the data so, constructor will be executing by default data and user can
         // modify data when they're creating an  objects
         name="bmw";
        color="white";
         numOfSeats=2;
         numOfTiers=4;
     }
     Car(String color){//parameterize constructor
         name="bmw";
         this.color=color;
         numOfSeats=2;
         numOfTiers=4;
     }
}




public class firstConstructorClass {
    public static void main(String[] args) {

        Car newCar = new Car("blue");
        System.out.println("your car color is: "+newCar.color);
        System.out.println("Car company: "+newCar.name);
        System.out.println("number of tyers: "+newCar.numOfTiers);
        System.out.println("number of seats: "+newCar.numOfSeats);
    }
}
