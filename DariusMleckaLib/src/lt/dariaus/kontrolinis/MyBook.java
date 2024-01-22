package lt.dariaus.kontrolinis;

import lt.techin.library.Book;
import lt.techin.library.BookCatalog;
import lt.techin.library.BookNotFoundException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class MyBook implements BookCatalog {
    private int catalogSize = 0;


    List<Book> books = new ArrayList<>();


    @Override
    public void addBook(Book book) throws IllegalArgumentException {
        if (book == null || book.getIsbn() == null || book.getIsbn().isEmpty() || book.getTitle() == null || book.getTitle().isEmpty())
            throw new IllegalArgumentException("No book, ISBN or title");
        String newIsbn = book.getIsbn();

        if (books.stream().anyMatch(b -> b.getIsbn().equals(newIsbn))) {
            throw new IllegalArgumentException("Book with this ISBN exists in list");
        }

        else books.add(book);
    }



    @Override
    public Book getBookByIsbn(String isbn) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        throw new BookNotFoundException("There is no book with the given ISBN");
    }

    @Override
    public List<Book> searchBooksByAuthor(String authorName) {
        List<Book> booksByAuthors = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthors().equals(authorName)) {
                booksByAuthors.add(book);
            }
        }
        return booksByAuthors;
        //return books.stream().filter(b -> b.getAuthors().equals(authorName)).toList();
    }

    @Override
    public int getTotalNumberOfBooks() {
        return books.size();
    }

    @Override
    public boolean isBookInCatalog(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) return true;
        }
        return false;
    }

    @Override
    public boolean isBookAvailable(String publisher) {
        for (Book book : books) {
            if (book.isAvailable()) return true;
        }
        return false;
    }

    @Override
    public Book findNewestBookByPublisher(String publisher) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                return book;
            }
        }
        throw new BookNotFoundException("No book from given publisher is found!");

//        return books.stream().
//                filter({b->b.getPublisher()==publisher;})
    }

    @Override
    public List<Book> getSortedBooks() {
        return books.stream().sorted(Comparator.comparing(Book::getPublicationYear)).toList();
    }

    @Override
    public Map<String, List<Book>> groupBooksByPublisher() {
        return books.stream().collect(groupingBy(Book::getPublisher));
    }

    @Override
    public List<Book> filterBooks(Predicate<Book> predicate) {
        if (predicate != null) return books.stream().filter(predicate).collect(Collectors.toList());
        {
            throw new IllegalArgumentException("Criteria cannot be null");

        }
    }

    @Override
    public BigDecimal calculateTotalPrice() {
        return books.stream().map(b -> (BigDecimal) b.getPrice()).reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
