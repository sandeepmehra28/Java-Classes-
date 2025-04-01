package javaCourseClasses;

import java.util.Collection;

public class Utility {

   public static<T> void Print(Collection<T> collection){
       for (T o : collection) {
           System.out.print("collection is: ");
           System.out.println(o);
       }
   }
}
