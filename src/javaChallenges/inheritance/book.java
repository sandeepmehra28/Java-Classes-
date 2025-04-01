package javaChallenges.inheritance;

public class book extends laibraryItemsClass{
    protected String isbn;


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("javaChallenges.inheritance.book{");
        sb.append("author='").append(getAuthor()).append('\'');
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", itemID='").append(getItemID()).append('\'');
        sb.append(", title='").append(getTitle()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
