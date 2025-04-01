package javaCourseClasses.stringClass;
//String patterns
public class patternString {
    public static void main(String[] args) {
/*
        String name= "java";//using String
        System.out.printf("String: %s \n",name);
        System.out.printf("String: %15s \n",name);
        System.out.printf("String: %-15s \n",name);
        System.out.printf("String: %-15S \n",name);
*/
        long num = 5544332211L;//using int
        System.out.printf("int: %d\n",num);//normal output
        System.out.printf("int: %,d\n",num);//output will be: 5,544,332,211
        System.out.printf("int: %-+,15d\n",num);//add (+) in your value :+5,544,332,211
        System.out.printf("int: %0,15d",num);//spaces will be added 0 (005,544,332,211) like this



    }
}
