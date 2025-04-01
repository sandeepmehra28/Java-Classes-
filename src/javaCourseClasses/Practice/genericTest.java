package javaCourseClasses.Practice;

import java.util.HashMap;
import java.util.Map;

class pair<K,V,M,N>{
   private final K name;
   private final V age;
   private final M id;
   private final N address;

    public pair(N address, V age, M id, K name) {
        this.address = address;
        this.age = age;
        this.id = id;
        this.name = name;
    }
    public N getAddress(){return address;}
    public V getAge(){return age;}
    public M getId(){return id;}
    public K getName(){return name;}

}


public class genericTest {
    public static void main(String[] args) {
    pair<String,Integer,Integer,String> info1 = new pair<>
            ("sandeep",22,2100,"khudanpuri(Alwar)");
        pair<String,Integer,Integer,String> info2 = new pair<>
                ("chaman",21,3100,"surya nagar(Alwar)");

        System.out.println(info1.getName()+"\n"+ info1.getAge()
                +"\n"+info1.getId()+"\n"+info1.getAddress()+"\n"+
                info2.getName()+"\n"+ info2.getAge()
                        +"\n"+info2.getId()+"\n"+info2.getAddress()
        );
        Map<String ,Integer> map = new HashMap<>();
        map.put("sandeep",22);
        map.put("sonu",21);
        map.put("sachin",20);
        for (String tr : map.keySet()) {
            System.out.printf("%s : %s\n",tr,map.get(tr));
        }
    }
}
