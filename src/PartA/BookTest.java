import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    public void testEquals() {
        Book book1 = new Book("Title", "Author", "Genre", 300, 2020, 1, "PG");
        Book book2 = new Book("Title", "Author", "Genre", 300, 2020, 1, "PG");
        assertEquals(book1, book2, "Books with the same attributes should be equal");
    }

    @Test
    public void testHashCode() {
        Book book1 = new Book("Title", "Author", "Genre", 300, 2020, 1, "PG");
        Book book2 = new Book("Title", "Author", "Genre", 300, 2020, 1, "PG");
        assertEquals(book1.hashCode(), book2.hashCode(), "Books with the same attributes should have the same hash code");
    }

    @Test
    public void testToString() {
        Book book = new Book("Title", "Author", "Genre", 300, 2020, 1, "PG");
        String expectedString = "Book [Title: Title, Author: Author, Genre: Genre, Pages: 300, Year: 2020, Edition: 1, Rating: PG]";
        assertEquals(expectedString, book.toString(), "toString() method should return the expected format");
    }

    @Test
    public void testCompareTo() {
        Book book1 = new Book("Title", "Author", "Genre", 300, 2020, 1, "PG");
        Book book2 = new Book("Title", "Author", "Genre", 300, 2020, 2, "PG");
        assertTrue(book1.compareTo(book2) < 0, "Book1 should be less than Book2 based on title and edition");
    }
}
