package lt.dariaus.kontrolinis;

import lt.techin.library.BookCatalog;
import lt.techin.library.test.AbstractLibraryTest;

public class ImplTests extends AbstractLibraryTest {
    @Override
    protected BookCatalog createBookCatalog() {
        return new MyBook();
    }
}
