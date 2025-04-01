package javaCourseClasses.FileWriter;

import java.io.FileWriter;//file writer import
import java.io.IOException;//IOException import

public class ExampleFile {
    public static void main(String[] args){
        String fileName="example.file.txt";
        //try-with-resource syntax
        try(FileWriter writer = new FileWriter(fileName)){
            //write int the file
            writer.write("this is an example file.\n");
            //only example for print star
//            for(int i =1;i<10;i++){
//                writer.write("*\n");
//            }
            //ensure all data is written out using flush
            writer.flush();
            System.out.println("file write successfully");

        }
        // using IOException in this case
        catch (IOException exception){
            System.out.printf("IOEXCEPTION occurred %s",exception.getMessage());
        }
    }
}
