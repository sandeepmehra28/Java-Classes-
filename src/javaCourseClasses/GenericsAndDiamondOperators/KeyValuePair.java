package javaCourseClasses.GenericsAndDiamondOperators;

public class KeyValuePair<K,V> implements pairClass2<K,V>{
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }


    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public K key() {
        return null;
    }

    @Override
    public V value() {
        return null;
    }

    public static void main(String[] args) {
        KeyValuePair<String,Integer> kvp = new KeyValuePair<>("sandeep",22);
        System.out.printf("%s %d",kvp.getKey(),kvp.getValue());
    }
}
