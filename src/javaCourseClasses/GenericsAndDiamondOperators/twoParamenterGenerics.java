package javaCourseClasses.GenericsAndDiamondOperators;

import java.util.HashMap;
import java.util.Map;

class pair<K,V>{
    private K key;
    private V value;

    public pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}


public class twoParamenterGenerics {
    public static void main(String[] args) {
        //generics use classes
        pair<String,Integer> pair = new pair<>("age",30);
        System.out.printf("Key: %s\nValue: %d",pair.getKey(),pair.getValue());
        System.out.println();
        //generics use in the map
        Map<String,Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        for (String tr : map.keySet()) {
            System.out.printf("%s : %s\n",tr,map.get(tr));
        }

    }
}
