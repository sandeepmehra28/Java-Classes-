package javaCourseClasses.stringClass;
// using printf string specifier;
public class stringSpecifier {
    public static void main(String[] args) {
        String name="Sandeep";
        float num = 99;
        int num1 = (int)num;
        boolean b = true;
        char c = 'A';
        System.out.printf("this is your String: %s",name);// %s
        System.out.println();
        System.out.printf("this is your float: %f",num);//%f use on floating and double number
        System.out.println();
        System.out.printf("this is your boolean: %b",b);//%b
        System.out.println();
        System.out.printf("this is your character: %c",c);//%c
        System.out.println();
        System.out.printf("this is your integer: %d",num1);//%d
    }
}
