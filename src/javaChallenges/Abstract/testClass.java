package javaChallenges.Abstract;

public class testClass {
    public static void main(String[] args) {
       CircleClass circle = new CircleClass(5);
       SquareClass square = new SquareClass(10.0);
        System.out.printf("Area of circle is %5.2f \n",circle.calculateArea());
        System.out.printf("area of square is %5.2f",square.calculateArea());
    }
}
