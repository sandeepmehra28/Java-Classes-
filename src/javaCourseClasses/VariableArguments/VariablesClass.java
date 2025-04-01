package javaCourseClasses.VariableArguments;

public class VariablesClass {
    //varargs method
    // String... elements
     static void printMany(String ...elements){
      for(String m:elements){
          System.out.println(m);
      }
    }
    //we're creating varargs in the method syn "int..."
    //ellipsis sign  int... , String... , etc
    static void printMethod(int... e){
        int sum=0;
         for (int i : e) {
            sum+=i;

        }
        System.out.print(sum);
    }

    public static void main(String... args) {
        VariablesClass.printMany("one","two","three","four","etc");
        VariablesClass.printMethod(3,4,5,6,7,8,8);
    }
}
