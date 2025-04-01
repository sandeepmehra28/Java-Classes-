package javaCourseClasses.constructor;

class pen{
    String penType;
    String penColor;
    int inPackets;


    pen(String penColor){
        penType ="ballpen";
        inPackets=6;
        this.penColor=penColor;
    }
    pen(){//constructor chaining
        this("blue");
    }
}


public class secConstructorClass {
    public static void main(String[] args) {
     pen i = new pen();
        System.out.println(i.penColor);
    }
}
