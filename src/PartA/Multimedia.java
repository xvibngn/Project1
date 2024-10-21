public class Multimedia {
    private String title;
    private String authorOrPublisher;
    private String type;
    private int length;
    private int publicationYear;
    private int edition;
    private String rating;

    public Multimedia(String title, String authorOrPublisher, String type, int length, int publicationYear, int edition, String rating) {
        this.title = title;
        this.authorOrPublisher = authorOrPublisher;
        this.type = type;
        this.length = length;
        this.publicationYear = publicationYear;
        this.edition = edition;
        this.rating = rating;
    }
}
