package javaCourseClasses.stringClass;
//String builder
public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sentence = new StringBuilder("this is my Stringbuilder :");
        sentence.append(45);
        sentence.append(", now this is the");
        sentence.append(45.55);
        System.out.println(sentence);
    }
}
