package javaCourseClasses.Enums;

public class TestingEnums {
    public static void main(String[] args) {
        TrafficLights color = TrafficLights.RED;
        for (TrafficLights value : TrafficLights.values()) {
            System.out.printf("%s:[%s]\n",value,value.getLower());

        }
        System.out.println(TrafficLights.valueOf("RED"));
        System.out.println(color.name());
        System.out.printf("this is signal: %s:[%s]",color.name(),color.getLower());
        System.out.println();



        grade grades = grade.valueOf("A");
        System.out.println(grades);
        for (grade value : grade.values()) {//using values() method
            System.out.println(value);
        }
        //grade.A.ValuesNum=200; if you modify the value so keep remove final
        System.out.printf("%d %s",grade.A.ValuesNum,grade.A.greeting);
    }
}
