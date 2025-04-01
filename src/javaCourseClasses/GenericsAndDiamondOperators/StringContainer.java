package javaCourseClasses.GenericsAndDiamondOperators;
//Implementing a generic interface generically
public class StringContainer<T> implements container<T>{
    private T items;
    @Override
    public void add(T items) {
         this.items=items;
    }

    @Override
    public T get() {
        return items;
    }

    public static void main(String[] args) {
        StringContainer <String> st = new StringContainer<>();
        st.items="macbook";
        System.out.println(st.get());
    }
}
