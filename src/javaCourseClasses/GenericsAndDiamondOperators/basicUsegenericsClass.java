package javaCourseClasses.GenericsAndDiamondOperators;
class specificClass{// jub bhi user iss class ko use karega to user buss iss class ko String ke purpose se hi use
    //kar sakta hai
    private String thing;

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }
}
class genericClass<T>{// user is ek class ko apne hissab se use kar sakta hai like String ,Integer
    // Double etc usse alag alag class banane ki jaurat nahi bus
    // usse class declare karte time generic type dena hoga

   private T thing;

    public T getThing() {
        return thing;
    }

    public void setThing(T thing) {
        this.thing = thing;
    }
}


public class basicUsegenericsClass {
    public static void main(String[] args) {
        specificClass sp = new specificClass();//this class only uses String
        sp.setThing("sandeep");
        System.out.println(sp.getThing());
        //hum ek generic type class ko alag alag type dekr use kar sakte hai
        genericClass<Integer> gc = new genericClass<>();
        genericClass<String>gc1 = new genericClass<>();
        gc.setThing(23);
        gc1.setThing("sandeep mehra");
        System.out.println(gc.getThing());
        System.out.println(gc1.getThing());
    }
}
