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
    
 // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getEdition() { return edition; }
    public String getRating() { return rating; }
    
 // Implement Comparable
    @Override
    public int compareTo(Book other) {
        int titleComparison = this.title.compareTo(other.title);
        if (titleComparison != 0) {
            return titleComparison;
        }
        return Integer.compare(this.edition, other.edition);
    }

}
