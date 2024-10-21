import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("Title", "Author", "Genre", 300, 2020, 1, "PG");
        library.addBook(book);
        List<Book> books = library.searchBookByTitle("Title");
        assertEquals(1, books.size(), "Library should contain 1 book after adding");
    }

    @Test
    public void testAddMultimedia() {
        Library library = new Library();
        Multimedia media = new Multimedia("Title", "Publisher", "DVD", 120, 2020, 1, "PG");
        library.addMultimedia(media);
        assertTrue(library.multimediaItems.contains(media), "Library should contain the added multimedia item");
    }

    @Test
    public void testSortByTitleAndEdition() {
        Library library = new Library();
        Book book1 = new Book("Title A", "Author", "Genre", 300, 2020, 1, "PG");
        Book book2 = new Book("Title B", "Author", "Genre", 400, 2021, 1, "PG");
        library.addBook(book1);
        library.addBook(book2);
        library.sortByTitleAndEdition();
        assertEquals("Title A", library.searchBookByTitle("Title").get(0).getTitle(), "Books should be sorted by title lexicographically");
    }

    @Test
    public void testSearchBookByTitle() {
        Library library = new Library();
        Book book1 = new Book("Title A", "Author", "Genre", 300, 2020, 1, "PG");
        Book book2 = new Book("Title B", "Author", "Genre", 400, 2021, 1, "PG");
        library.addBook(book1);
        library.addBook(book2);
        List<Book> result = library.searchBookByTitle("Title A");
        assertEquals(1, result.size(), "There should be 1 matching book with 'Title A'");
    }
}
