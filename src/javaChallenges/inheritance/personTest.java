package javaChallenges.inheritance;

public class personTest {
    public static void main(String[] args) {
        personClass p1  = new personClass("sandeep",22);
        personClass p2  =new personClass("sandeep",22);
        if(p1.hashCode()==p2.hashCode()){
            System.out.println("your both objects are equal..");
        }else {
            System.out.println("not equal..");
        }
    }
}
