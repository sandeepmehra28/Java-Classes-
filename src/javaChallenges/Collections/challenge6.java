package javaChallenges.Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

//Create a PriorityQueue of a custom class Student with attribute
//name and grade. Use a comparator to order by grade.
                           // Revisit this program
public class challenge6 {
    public static void main(String[] args) {
        PriorityQueue<student> queue= new PriorityQueue<>(new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return o1.getStudentGrade()- o2.getStudentGrade();
            }
        });
        queue.offer(new student('B',"sandeep"));
        queue.offer(new student('A',"sachin"));
        queue.offer(new student('C',"sonu"));
        queue.offer(new student('B',"chaman"));
        System.out.println("got: "+queue.poll());
        System.out.println("got: "+queue.poll());
        System.out.println("got: "+queue.poll());
        System.out.println("got: "+queue.poll());
        System.out.println("got: "+queue.poll());
    }
   public static class student{
       private final String studentName;
       private final char studentGrade;

       public student(char studentGrade, String studentName) {
           this.studentGrade = studentGrade;
           this.studentName = studentName;
       }

       public char getStudentGrade() {
           return studentGrade;
       }

       public String getStudentName() {
           return studentName;
       }

       @Override
       public String toString() {
           final StringBuilder sb = new StringBuilder("student{");
           sb.append("studentGrade=").append(getStudentGrade());
           sb.append(", studentName='").append(getStudentName()).append('\'');
           sb.append('}');
           return sb.toString();
       }
   }
}

