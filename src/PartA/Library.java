import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Library {
    private List<Book> books;
    private List<Multimedia> multimediaItems;

    public Library() {
        this.books = new ArrayList<>();
        this.multimediaItems = new ArrayList<>();
    }
    
 // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

 // Add a multimedia item to the library
    public void addMultimedia(Multimedia item) {
        multimediaItems.add(item);
    }
    
 // Sort lexicographically by Title and then by Edition
    public void sortByTitleAndEdition() {
        Collections.sort(books);
        Collections.sort(multimediaItems);
    }
}