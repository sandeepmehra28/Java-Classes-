package javaCourseClasses.Enums;

public enum grade {
    A(90,"very-good"),
    B(80,"good"),
    C(70,"good"),
    D(60,"average"),
    E(50,"not-good"),
    F(40,"very-low");
     final int ValuesNum;
     final String greeting;
    grade(int valuesNum ,  String greeting1) {
        ValuesNum = valuesNum;
        this.greeting = greeting1;

    }

}
