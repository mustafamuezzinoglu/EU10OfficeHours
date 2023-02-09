package week12_11_01_2023.encapsulation;

public class BookInfo{

    //book name
    private String bookName;
    // year
    private int year;
    //ASIN
    private long ISSN;
    //borrow or not
    private boolean isBorrowed;


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getISSN() {
        return ISSN;
    }

    public void setISSN(long ISSN) {
        this.ISSN = ISSN;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public BookInfo(String bookName, int year, long ISSN, boolean isBorrowed) {
        this.bookName = bookName;
        this.year = year;
        this.ISSN = ISSN;
        this.isBorrowed = isBorrowed;
    }
}
