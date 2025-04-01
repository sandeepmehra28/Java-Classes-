package javaCourseClasses.FileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import  java.io.File;

public class FileClassMethod {
   public static Scanner input = new Scanner(System.in);
    // Filer writer method
    public static void FileWriter(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter your file name with (.txt, .jpg etc: ): ");
        String fileNameWrite = input.nextLine();
        System.out.print("enter your data in the file : ");
        String paragraph = input.next();
        //try-with method
        try(FileWriter writer = new FileWriter(fileNameWrite)){
            writer.write(paragraph);
            writer.flush();
            System.out.println("file write successfully..");
        }catch (IOException exception){//exception handling
            System.out.printf("i/o exception occurred : %s",exception.getMessage());
        }
    }
    // file reader method
    public static void FileReader(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter your file name for read: ");
        String fileNameForRead =input.next();
        //try-with method
        try(FileReader reader = new FileReader(fileNameForRead)){
           int read=0;
            do{
                read=reader.read();//assign read method into local variable
                System.out.print((char) read);
            }while(read != -1);
        }catch (IOException exception){//exception handling
            System.out.printf("IOException occurred: %s",exception.getMessage());
        }
    }
    // file delete method
    public static void fileDelete(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter file name for delete: ");
        String fileName = input.next();
        File obj = new File(fileName);//creating a file object
        if (obj.delete()) {
            System.out.println("Deleted the file: " + obj.getName());
            System.out.println("successfully delete.. :)");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

}










