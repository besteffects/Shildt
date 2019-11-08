package bookpack;//bookpack.Book recoded for public access

// packages.bookpack.Book and its members must be public in order to be used by other packages
public class Book {
    private String title;
    private String author;
    private int pubDate;

    public Book(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    //now public
    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}
