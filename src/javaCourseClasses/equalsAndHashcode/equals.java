package javaCourseClasses.equalsAndHashcode;

public class equals {
    public static void main(String[] args) {
        person p1 =new person(22,"0091","sandeep");
        person p2 =new person(22,"0091","sandeep");
        if(p1.hashCode()==p2.hashCode()){
            System.out.println("your both objects are equal..");
        }else {
            System.out.println("not equals..");
        }
    }

}
