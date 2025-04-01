package javaCourseClasses.Collections;

import javaCourseClasses.Utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(4);
        li.add(5);
        li.add(6);
        li.add(-4);

        Utility.Print(li);
        System.out.println();
        //shorting using a collection
        System.out.println("randomly shuffle");
        Collections.sort(li);
        Utility.Print(li);
        System.out.println();
        //reverse the list using a collection
        System.out.println("reverse");
        Collections.reverse(li);
        Utility.Print(li);
        System.out.println();
        //randomly shuffle
        System.out.println("shuffle");
        Collections.shuffle(li);
        Utility.Print(li);

    }
}
