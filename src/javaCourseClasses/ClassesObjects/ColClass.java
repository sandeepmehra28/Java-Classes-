package javaCourseClasses.ClassesObjects;

public class ColClass {
    String studentName ;
     String colName="DEV INTERNATIONAL COLLEGE (ALWAR)";
    String courseName = "B.C.A";
     int noOfClasses=6;
     String [] subjects={"1. Web Desiging and Multimedia \n","2. Operating System \n","3. Business Accounts \n","4. DataBase Management System \n","5. C++\n","6. Maths "};

    ColClass(String studentName){
        this.studentName=studentName;
    }

     public void collDetails(){
         System.out.println("your  name: "+studentName);
        System.out.println("College name: "+colName);
         System.out.println("your course name: "+courseName);
        System.out.println("according your subjects your classes : "+noOfClasses);
        System.out.println("your subjects in the college..!");
        for(String n:subjects){
            System.out.print(n);
        }
    }
}
