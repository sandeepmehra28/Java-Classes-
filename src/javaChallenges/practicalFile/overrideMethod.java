package javaChallenges.practicalFile;
class Over{
    public static void sum(int num1,int num2){
        System.out.println("total: "+num1+num2);
    }
    public  static void sum(int age,String name){
        System.out.println("your age is : "+age);
        System.out.println("your name is : "+name);
    }
}
public class overrideMethod {
    public static void main(String[] args) {
        Over.sum(5,5);
        Over.sum(22,"sandeep");
    }
}
