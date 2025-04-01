package javaChallenges.ClassesAndObject;
class courseClass {

    String courseName;
    int  enrollments;
    static  int maxCapacity=100;
    String [] enrolledStudents ;
    static void setMaxCapacity(int maxCapacity){
        courseClass.maxCapacity=maxCapacity;
    }

    void enrollStudents (String studentNames){
    enrolledStudents[enrollments]=studentNames;
    enrollments++;
    }
     void unEnrolments(String studentNames){
         System.out.println("student remove..!");
         enrollments--;
     }
     courseClass(String courseName){
        this.courseName=courseName;
        this.enrollments=0;
        this.enrolledStudents=new String[maxCapacity];
     }
     void info(){
         System.out.println("this is your course name: "+courseName);
         System.out.println("this is your enrolled students: "+enrolledStudents);
     }
}
