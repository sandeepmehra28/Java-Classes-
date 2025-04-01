package javaChallenges.Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Write a program that takes a string and returns the number of
//unique characters using a Set.
public class challenge7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Character> unique = new HashSet<>();
        System.out.print("please enter your String: ");
        String userStr = input.next();
        for (char ch : userStr.toCharArray()) {
            unique.add(ch);
        }
        System.out.printf("Your string has %d unique characters",
                unique.size());
    }
}
