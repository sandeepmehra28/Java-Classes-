package javaChallenges.practicalFile;
//explain the exception handling with a suitable example
public class ExceptionHandling {
    public static void main(String[] args) {
   int i=0,j=0,k;
   try{
       k=i/j;
   }catch (ArithmeticException ae){
       System.out.println(ae.getMessage());
   }
    }
}
