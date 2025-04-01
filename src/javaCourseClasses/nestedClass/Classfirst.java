package javaCourseClasses.nestedClass;
//nested class
class vehicle{
    private int noOfDoors;
    public void repair(){
        bike b = new bike();

    }
    protected  class bike{
        protected  String carName;
        protected int noOfTires;
        protected double fuelLevel;
      public   void associate(){
            noOfDoors=4;
        }
    }

}




 class Classfirst {

     public static void main(String[] args) {
         vehicle v = new vehicle();
         System.out.println(v.toString());



     }


}
