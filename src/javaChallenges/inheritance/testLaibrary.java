package javaChallenges.inheritance;

public class testLaibrary {
    public static void main(String[] args) {
        book b = new book();
        b.checkout();
        b.returnItem();
        b.isbn="book";
        b.setAuthor("sandeep");
        b.setTitle("life's");
        b.setItemID("0097");
        System.out.println(b.toString());
        magazine m = new magazine();
        m.checkout();
        m.returnItem();
        m.issueNumber="009";
        m.setAuthor("sandeep");
        m.setTitle("leave");
        m.setItemID("0099");
        System.out.println(m.toString());
        DVD d = new DVD();
        d.durationNo=1;
        d.returnItem();
        d.checkout();
        d.setAuthor("sandeep");
        d.setTitle("leave");
        d.setItemID("0099");
        System.out.println(d.toString());
    }
}
