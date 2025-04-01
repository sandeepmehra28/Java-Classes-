package javaCourseClasses.equalsAndHashcode;

import java.util.Objects;

//checking equality using hashcode and equals
public class person {
    private  String name;
    private  String id;
    private  int age;

    public int getAga() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public person(int age, String id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof person person)) return false;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, age);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("javaCourseClasses.equalsAndHashcode.person{");
        sb.append("age=").append(age);
        sb.append(", id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
