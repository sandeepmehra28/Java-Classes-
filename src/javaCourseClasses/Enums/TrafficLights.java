package javaCourseClasses.Enums;

public enum TrafficLights {
    RED("stop"),GREEN("go"),YELLOW("stay");
   // private final String Action;

//    TrafficLights(String action) {
//        Action = action;
//    }

    TrafficLights(String lower) {
        this.lower = lower;
    }

    private String lower;

    public String getLower() {
        return lower;
    }

    public void display(){
        System.out.println("today is : "+this.name());
//        System.out.println(this.name());
    }

}
