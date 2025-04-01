package javaChallenges.ClassesAndObject;

class Book{
    String title;
    String author;
    String isbn;
    static int totalNoOfBooks;
    boolean isBorrowed;
    static {
        totalNoOfBooks=0;
    }
    {// object init
        totalNoOfBooks++;
    }

    static int getNoOfBooks(){
        return totalNoOfBooks;
    }
    Book(String isbn, String author, String title){
        this.isbn=isbn;
        this.author=author;
        this.title=title;
    }
    Book(String isbn){
        this(isbn,"unknown","unknown");
    }
    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed..");
        }else {
            this.isBorrowed = true;
            System.out.println("enjoy the book...");
        }
    }
    void returnBook(){
        if(isBorrowed){
            isBorrowed=false;
            System.out.println("hope you enjoyed..");
        }else {
            System.out.println("this book already in the laibrary...");
        }

    }

}
