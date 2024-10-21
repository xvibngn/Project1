public class Book {
    private String title;
    private String author;
    private String genre;
    private int pageCount;
    private int publicationYear;
    private int edition;
    private String rating;

    public Book(String title, String author, String genre, int pageCount, int publicationYear, int edition, String rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pageCount = pageCount;
        this.publicationYear = publicationYear;
        this.edition = edition;
        this.rating = rating;
    }
}
