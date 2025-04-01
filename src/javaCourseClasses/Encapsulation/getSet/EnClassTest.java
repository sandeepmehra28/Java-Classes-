package javaCourseClasses.Encapsulation.getSet;
public class EnClassTest {
    public static void main(String[] args) {
        EnClass f1 = new EnClass();
        f1.setColor("gray");
        f1.setPrice(55000);
        f1.setModel("apple");
        System.out.printf("%S\n%d\n%S\n",f1.getColor(),f1.getPrice(),f1.getModel());
    }
}
