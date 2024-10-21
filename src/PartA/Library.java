import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Multimedia> multimediaItems;

    public Library() {
        this.books = new ArrayList<>();
        this.multimediaItems = new ArrayList<>();
    }
}
