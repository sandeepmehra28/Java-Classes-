package javaChallenges.ClassesAndObject;

public class CourseClassObjects {
    public static void main(String[] args) {
        courseClass std1 = new courseClass("BCA");
        courseClass.setMaxCapacity(5);
        std1.enrollStudents("sandeep");
        std1.enrollStudents("sonu");
    }
}
