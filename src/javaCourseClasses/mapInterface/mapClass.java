package javaCourseClasses.mapInterface;

import java.util.HashMap;
import java.util.Map;

public class mapClass {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("sandeep",50);
        map.put("sachin",60);
        map.put("sonu",70);
        map.put("chaman",80);
        System.out.println(map.size());//your map size
        System.out.println(map.get("sandeep"));// get values
        System.out.println(map.containsKey("geeta"));
        System.out.println(map.containsKey("sonu"));//contain element
        System.out.println(map.containsValue(80));// contain values
        System.out.println(map.remove("sonu"));//remove
        System.out.println(map.remove("chaman",80));//remove

        for (String tr : map.keySet()) {
            System.out.printf("%s : %s\n",tr,map.get(tr));
        }

    }
}
