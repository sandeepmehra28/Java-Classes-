package javaChallenges.EnumsChallenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Bharat", "New Delhi");
        map.put("China", "Beijing");
        map.put("Pakistan", "Islamabad");
        map.put("SriLanka", "Columbo");
        map.put("Bangladesh", "Dhaka");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the country name: ");
        String country = input.next();
        if (map.containsKey(country)) {
            System.out.printf("Capital of %s is %s", country,
                    map.get(country));
        } else {
            System.out.println("Sorry We don't know the capital");
        }
    }
}
