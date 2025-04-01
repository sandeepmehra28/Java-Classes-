package javaCourseClasses.ExceptionHandling;

public class ExceptionDivideClass {
    public static void main(String[] args) {

        int [] arr1 = {4,6,6,8};
        int [] arr2 = {2,3,0,4};
        for(int i =0; i<10;i++){
            try{
                System.out.println(divide(arr1[i],arr2[i]));
            }catch (ArrayIndexOutOfBoundsException e){// array out of bound exception
                System.out.println(e);
            }
        }
        System.out.println("good job..!");
    }
    public static int divide(int a, int b){
       try{
           return a/b;
       }catch (ArithmeticException e ){//arithmetic exception
           System.out.println(e);
           return -1;
       }
       //this is a parent exception
//       catch (Exception e){
//           System.out.println(e);return -1;
//       }

    }
}
