package javaCourseClasses.ExceptionHandling;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        try {
           int sum = num1/num2;
        }
//        catch (ArithmeticException exception){// arithmetic exception
//            System.out.printf("%s ,enter valid values"
//                    ,exception.getMessage());
//        }catch (ArrayIndexOutOfBoundsException ex){// array exception
//            System.out.println(ex.getStackTrace());
//        }
            catch(ArrayIndexOutOfBoundsException | ArithmeticException exception){// using this ( | ) we check multiple exception
                System.out.println("multiple exception");
            }


        }
}
