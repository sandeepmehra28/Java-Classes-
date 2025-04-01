package javaChallenges.Collections;
//Use the Collections class to count the frequency of a particular
//element in an ArrayList.
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class challenge1 {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(1,1,2,3,4,5,5,6,7,8,9);
        System.out.println(Collections.frequency(list, 1));
        System.out.println(Collections.frequency(list,5));
    }
}
