package javaCourseClasses.PassBy;
//outer class
public class passByRef {
    //main method
    public static void main(String[] args) {
        point first = new point(4,8);
        System.out.println("first: "+first);
        move(first);
        System.out.println("first: "+first);
    }
    //method
    public static void move( point p ){
        p.x++;
        p.y++;
        System.out.println(p);
    }
    //inner class
    public static class point{
        int x;
        int y;
        //constructor
        public point(int y  , int x) {
         this.x=x;
         this.y=y;
        }
        //toString method
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("point{");
            sb.append("x=").append(x);
            sb.append(", y=").append(y);
            sb.append('}');
            return sb.toString();
        }
    }
}
