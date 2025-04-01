package javaChallenges.fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//File Not Found Exception Handling
//Write a program to read a filename from the user and display its
//content. The program should handle the situation where the file
//does not exist.
//Key Points:
//• Use Scanner to read the filename from the user.
//• Use FileReader to read the file content.
//• Implement a try-catch block to handle FileNotFoundException.
//• Display a message informing the user if the file is not found.
public class challenge1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your file name: ");
        String fileName = input.next();
        try(FileReader reder = new FileReader(fileName)){
//            first term fo reading ---
//            int read =0;
//            do{
//                read=reder.read();
//                System.out.print((char) read);
//            }while(read != -1);
            // second term for reading
            int read;
            while((read=reder.read())!= -1) {
                System.out.print((char) read);
            }
        }catch (FileNotFoundException ex){
            System.out.printf("file not found : %s",ex.getMessage());
        }
        catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
