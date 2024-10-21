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
        
        // Getters
    public String getTitle() { return title; }
    public String getAuthorOrPublisher() { return authorOrPublisher; }
    public String getRating() { return rating; }
    }
    
 // Implement Comparable
    @Override
    public int compareTo(Multimedia other) {
        int titleComparison = this.title.compareTo(other.title);
        if (titleComparison != 0) {
            return titleComparison;
        }
        return Integer.compare(this.edition, other.edition);
    }
    
 // equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Multimedia that = (Multimedia) o;
        return length == that.length &&
               publicationYear == that.publicationYear &&
               edition == that.edition &&
               title.equals(that.title) &&
               authorOrPublisher.equals(that.authorOrPublisher) &&
               type.equals(that.type) &&
               rating.equals(that.rating);
    }

 // hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(title, authorOrPublisher, type, length, publicationYear, edition, rating);
    }


}
