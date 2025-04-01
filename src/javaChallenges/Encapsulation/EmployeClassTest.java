package javaChallenges.Encapsulation;

public class EmployeClassTest {
    public static void main(String[] args) {
        EmployeClass emp1 = new EmployeClass(22,"sandeep",50000);
        System.out.printf("%d\n%S\n%d",emp1.getAge(),emp1.getName(),emp1.getSalary());
        emp1.setName("sunny");
        System.out.printf("%d\n%S\n%d",emp1.getAge(),emp1.getName(),emp1.getSalary());
    }
}
