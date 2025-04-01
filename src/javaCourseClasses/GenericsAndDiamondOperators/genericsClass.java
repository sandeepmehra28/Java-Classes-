package javaCourseClasses.GenericsAndDiamondOperators;

public class genericsClass {
    public static void main(String[] args) {
        BoxClass<Integer> box = new BoxClass<>();// Box is now type-safe
        box.setValue(3); // No issue, it's an Integer
        System.out.println(box.getValue()); // No casting needed
    }
}
