package javaCourseClasses.Practice;
class paired2<T,K>{
    private T value;
    private K id;

    public paired2(T value,K id) {
        this.value = value;
        this.id = id;
    }

    public T getValue() {
        return value;
    }
    public K getId(){
        return id;
    }
}
public class GeneracisLecture {
    public static void main(String[] args) {
        paired2 <String,Integer> stdNames1 = new paired2<>("sandeep",21);
        paired2 <String,Integer> stdNames2 = new paired2<>("Chaman",21);
        paired2 <String,Integer> stdNames3 = new paired2<>("Sachin",20);
        paired2 <String,Integer> stdNames4 = new paired2<>("sonu",20);
        System.out.printf(stdNames1.getValue()+"\n"+
                          stdNames2.getValue()+"\n"+
                          stdNames3.getValue()+"\n"+
                          stdNames4.getValue()+"\n"
        );

    }
}
