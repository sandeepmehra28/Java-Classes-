package javaChallenges.Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//. Create a program that reverses the elements of a List and prints
//the reversed list.
public class challenge5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println("before: "+list);
         reverse(list);
        System.out.println("after: "+list);
    }
    public static void reverse(List<Integer> list) {
        //Collections.reverse(list);

        //custom swapping
        for (int i = 0; i < list.size() / 2; i++) {
            Collections ListSwapping = null;
            ListSwapping.swap(list, i, list.size() - 1 - i);
        }
    }
}
