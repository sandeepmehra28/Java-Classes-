package javaCourseClasses.SetInterface;

import javaCourseClasses.Utility;

import java.util.HashSet;
import java.util.Set;

public class SetClass {
    public static void main(String... args) {
        Set <String> set = new HashSet<>();
        set.add("apple");//add()  adds the specified elements
        set.add("orange");
        set.add("mango");
        set.add("banana");
        set.add("kiwi");
        //adding element
//        boolean isadd = set.add("Apple");
//        System.out.println("Apple is added: "+isadd);
        // contains the element search purpose
//        boolean containOranges = set.contains("orange");
//        System.out.println("contain oranges: "+containOranges);

        //set.remove("orange");
        Utility.Print(set);
        System.out.println("size: "+set.size());//showing the size of setList
        //System.out.println(set.isEmpty());//if your set is empty isEmpty method returns true otherwise return false

    }
}
