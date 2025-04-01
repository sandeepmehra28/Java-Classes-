package javaCourseClasses.ListInterface;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;


public class TestingListMethods {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Printer<Integer> prints =new Printer<>(55);// this list creates by own
        stringPrinter <String> stringPrinter = new stringPrinter<>("sandeep");
        stringPrinter.stringPrint();
        prints.Print();
        list.add("sandeep");
        list.add("mehra");
        list.add(1,"intern");//insert element
        list.remove(1);// remove element method
        list.set(1,"Mehra");//replace the element at the specific position
       // list.clear();// clear all the elements in the list
        if(list.contains("Mehra")){//return true is the list contains the specific element;
            System.out.println("your element is exist in the list");
            System.out.println(list.indexOf("Mehra"));//shown the element index in the list
        }
       for(String s:list){//for-each loop for list
           System.out.println(s);
       }


    }
}
