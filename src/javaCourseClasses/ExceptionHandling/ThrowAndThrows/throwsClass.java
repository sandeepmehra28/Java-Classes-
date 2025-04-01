package javaCourseClasses.ExceptionHandling.ThrowAndThrows;

import java.util.Scanner;

public class throwsClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name= input.next();
        String n = printName(name);
        System.out.println(n);
    }
    public static String   printName(String name) throws IllegalArgumentException{
        if(name.contains("-")){
            throw new IllegalArgumentException("name contains: -");
        }
        return name;
    }
}
