package javaCourseClasses.ExceptionHandling.ThrowAndThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//with using finally keyword
public class TextClass {
    public static void main(String[] args) throws IOException {
        // in java 7 without using finally keyword
        try(BufferedReader reader = new BufferedReader(new FileReader("exapmle.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("IOException caught: "+ e.getMessage());
        }

    }
}
