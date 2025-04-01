package javaChallenges.inheritance;
//Start with a base class LibraryItem that includes common
//attributes like itemID, title, and author, and methods like
//checkout() and returnItem(). Create subclasses such as Book,
//Magazine, and DVD, each inherited from LibraryItem. Add unique
//attributes to each subclass, like ISBN for Book, issueNumber for
//Magazine, and duration for DVD.
public class laibraryItemsClass {
    private String itemID;
    private String title;
    private String author;


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public void checkout(){
        System.out.println("checkout..");
    }
    public void returnItem(){
        System.out.println("returnItems...");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("javaChallenges.inheritance.laibraryItemsClass{");
        sb.append("author='").append(author).append('\'');
        sb.append(", itemID='").append(itemID).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
