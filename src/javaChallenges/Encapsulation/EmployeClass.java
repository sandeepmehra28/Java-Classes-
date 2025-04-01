package javaChallenges.Encapsulation;
//Define a class Employee with private attributes (like name, age,
//and salary), public methods to get and set these attributes, and a
//package-private method to displayEmployeeDetails. Create
//another class in the same package to test access to the
//displayEmployeeDetails method.
public class EmployeClass {
    private String name;
    private int age;
    private long salary;

    public EmployeClass(int age, String name, long salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public long getSalary(){
        return salary;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(long salary){
        this.salary=salary;
    }
}
