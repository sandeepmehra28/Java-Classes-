package javaChallenges.StringClassesChalange.string.s;

//Define a Student class with fields like name and age, and use

//toString to print student details.

class Student {
    String name;
    int age;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("challenge.string.Student{");
        sb.append("age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

public class challenge1 {
    public static void main(String[] args) {
        Student std1 = new Student(22, "sandeep");
        System.out.println(std1);
    }
}
