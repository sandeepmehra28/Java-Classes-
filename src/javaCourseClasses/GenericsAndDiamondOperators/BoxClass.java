package javaCourseClasses.GenericsAndDiamondOperators;
//generic type class
public class BoxClass <B>{//  one or more type parameters
    //  These type parameters are placeholders that are replaced with specific types when the class is instantiated
    private B value;

    public BoxClass() {
        this.value = value;
    }

    public B getValue() {
        return value;
    }

    public void setValue(B value) {
        this.value = value;
    }
}
