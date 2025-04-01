package javaCourseClasses.inheritance;


class twowheeler extends vehicleClass{
    twowheeler(){
        setNumberOfTires(2);
    }
    void balance(){
        System.out.println("i am balancing on two tires..!");
    }
}
