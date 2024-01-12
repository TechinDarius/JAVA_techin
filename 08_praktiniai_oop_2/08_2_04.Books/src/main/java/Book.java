public class Book {
    private String bookName;
    private int pages;
    private int year;

    public Book(String bookName, int pages, int year) {
        this.bookName = bookName;
        this.pages = pages;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return getBookName()+", "+getPages()+" pages, "+getYear();
    }
}
