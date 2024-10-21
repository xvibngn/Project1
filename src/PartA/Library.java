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
    
 // Sort reverse lexicographically by Author and Rating
    public void sortByAuthorAndRating() {
        books.sort((b1, b2) -> {
            int authorComparison = b2.getAuthor().compareTo(b1.getAuthor());
            if (authorComparison != 0) {
                return authorComparison;
            }
            return b2.getRating().compareTo(b1.getRating());
        });

        multimediaItems.sort((m1, m2) -> {
            int authorComparison = m2.getAuthorOrPublisher().compareTo(m1.getAuthorOrPublisher());
            if (authorComparison != 0) {
                return authorComparison;
            }
            return m2.getRating().compareTo(m1.getRating());
        });
    }
    
 // Search books by title (starts with search)
    public List<Book> searchBookByTitle(String titlePrefix) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().startsWith(titlePrefix)) {
                result.add(book);
            }
        }
        return result;
    }
    
 // Print all matching items to the screen
    public void printMatchingBooks(String titlePrefix) {
        List<Book> matchingBooks = searchBookByTitle(titlePrefix);
        for (Book book : matchingBooks) {
            System.out.println(book);
        }
    }


}