package javaChallenges.inheritance;

import java.util.Objects;

//Create a class Person with attribute's name and age. Override
//equals() to compare Person objects based on their attributes.
//Override hashCode() consistent with the definition of equals().
public class personClass {
    private String name;
    private int age;
    personClass(String name,int age){
        this.name=name;
        this.age=age;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof personClass that)) return false;
//        return age == that.age && Objects.equals(name, that.name);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
