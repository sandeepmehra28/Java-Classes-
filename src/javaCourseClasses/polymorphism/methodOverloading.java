package javaCourseClasses.polymorphism;

class Overload{
    public static int  sum(int num1 , int num2){//method overloading
        return num1+num2;
    }
    public static  String sum(String s1,String s2){//method overloading
        return s1.concat(s2);
    }

}

public class methodOverloading {
    public static void main(String[] args) {
    Overload ov = new Overload();
        System.out.println(ov.sum(5,5));
        System.out.println(ov.sum("sandeep ","mehra"));
    }
}
