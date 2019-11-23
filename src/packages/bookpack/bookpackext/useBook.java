package packages.bookpack.bookpackext;

public class useBook {
    public static void main(String[] args) {
        packages.bookpack.Book books[] = new packages.bookpack.Book[5];
        books[0] = new packages.bookpack.Book("Java: A Beginner's guide", "Shildt", 2019);
        books[1] = new packages.bookpack.Book("Java: The complete Reference", "Shildt", 2019);
        books[2] = new packages.bookpack.Book("Introducing JavaFX 8 Programming", "Shildt", 2015);
        books[3] = new packages.bookpack.Book("Red Storm rising", "Clancy", 1986);
        books[4] = new packages.bookpack.Book("On the road", " Kerouac", 1955);

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
    }
}
