package javaCourseClasses.Practice;

import java.util.HashMap;
import java.util.Map;

class box<T>{
    private  T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
public class genFirst {
    public static void main(String[] args) {
//        box<String> b = new box<>();
//        box<Integer> i = new box<>();
//        b.setValue("sandeep");
//        i.setValue(34);
//        System.out.println(b.getValue());
//        System.out.println(i.getValue());
        Map <String,Integer> information1 = new HashMap<>();
        information1.put("Sandeep",22);
        information1.put("Chaman",21);
        information1.put("sachin",20);
        information1.put("Dilip",24);
        information1.put("Raheesh",20);
        information1.put("Gulshan",21);
        for (String str: information1.keySet()){
            System.out.printf("%s : %s\n",str,information1.get(str));
        }

    }

}
