package javaChallenges.Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Write a program that sorts a list of String objects in descending
//order using a custom Comparator
                                  // most important
public class challenge3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bear","dog","lion","tiger","zebra","elephant");
        System.out.println(list);
        sortInDecending(list);
        System.out.println(list);

    }
      public static void sortInDecending(List <String> stringList){
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.equals(o2)){
                    return 0;
                } else if (o1.charAt(0)< o2.charAt(0)) {
                    return -1;//you control the order using -1, 1;
                }else {
                    return 1;//you control the order using -1, 1;
                }
            }
        });
      }
}
