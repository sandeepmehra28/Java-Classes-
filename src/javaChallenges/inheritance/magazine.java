package javaChallenges.inheritance;

public class magazine extends laibraryItemsClass{
    protected String issueNumber;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("javaChallenges.inheritance.magazine{");
        sb.append("author='").append(getAuthor()).append('\'');
        sb.append(", issueNumber='").append(issueNumber).append('\'');
        sb.append(", itemID='").append(getItemID()).append('\'');
        sb.append(", title='").append(getTitle()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
