import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultimediaTest {

    @Test
    public void testEquals() {
        Multimedia media1 = new Multimedia("Title", "Publisher", "DVD", 120, 2020, 1, "PG");
        Multimedia media2 = new Multimedia("Title", "Publisher", "DVD", 120, 2020, 1, "PG");
        assertEquals(media1, media2, "Multimedia items with the same attributes should be equal");
    }

    @Test
    public void testHashCode() {
        Multimedia media1 = new Multimedia("Title", "Publisher", "DVD", 120, 2020, 1, "PG");
        Multimedia media2 = new Multimedia("Title", "Publisher", "DVD", 120, 2020, 1, "PG");
        assertEquals(media1.hashCode(), media2.hashCode(), "Multimedia items with the same attributes should have the same hash code");
    }

    @Test
    public void testToString() {
        Multimedia media = new Multimedia("Title", "Publisher", "DVD", 120, 2020, 1, "PG");
        String expectedString = "Multimedia [Title: Title, Author/Publisher: Publisher, Type: DVD, Length: 120, Year: 2020, Edition: 1, Rating: PG]";
        assertEquals(expectedString, media.toString(), "toString() method should return the expected format");
    }

    @Test
    public void testCompareTo() {
        Multimedia media1 = new Multimedia("Title", "Publisher", "DVD", 120, 2020, 1, "PG");
        Multimedia media2 = new Multimedia("Title", "Publisher", "DVD", 120, 2020, 2, "PG");
        assertTrue(media1.compareTo(media2) < 0, "Media1 should be less than Media2 based on title and edition");
    }
}
