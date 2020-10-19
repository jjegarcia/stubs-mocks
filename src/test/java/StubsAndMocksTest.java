import MovieDonate.Library;
import MovieDonate.Movie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

public class StubsAndMocksTest {
    @Test
    public void donateMovvieAddedToCatalogWithIMDBInfo() {
        String imdbId = "jogght666";
        String title = "The Goonies";
        int year = 1985;
        Library library = new Library();
        library.donate(imdbId);
        Movie movie = library.findMovie(imdbId);
        assertEquals(title,movie.getTitle());
        assertEquals(year,movie.getYear());
    }
}
