package javaChallenges.ClassesAndObject;

public class challenge1_object {
    public static void main(String[] args) {
        Book nature  = new Book("1","author","nature");
        System.out.println(nature.getNoOfBooks());
        Book design = new Book("2");
        System.out.println(nature.getNoOfBooks());
        design.borrowBook();
        nature.borrowBook();
    }

}

