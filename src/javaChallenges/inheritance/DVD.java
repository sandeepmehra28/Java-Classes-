package javaChallenges.inheritance;

public class DVD extends laibraryItemsClass{
    protected int durationNo;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("javaChallenges.inheritance.DVD{");
        sb.append("author='").append(getAuthor()).append('\'');
        sb.append(", durationNo=").append(durationNo);
        sb.append(", itemID='").append(getItemID()).append('\'');
        sb.append(", title='").append(getTitle()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
