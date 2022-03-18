package book.entity;

import book.exception.BadBookException;
import book.valid.ValidNumberOfPages;
import book.valid.ValidPrice;
import book.valid.ValidYearOfPublication;

import java.io.Serializable;
import java.util.Objects;

// Book: id, Название, Автор(ы), Издательство, Год издания, Количество страниц, Цена, Переплет.
public class Book implements Comparable<Book>, Serializable, Cloneable{
    private long bookId;
    private String title;
    private String author;
    private String publishingHouse;  // не обязательное поле
    private int yearOfPublication;  // не обязательное поле
    private int numberOfPages;  // не обязательное поле
    private double price;  // не обязательное поле
    private String binding;   // переплет, не обязательное поле

    // логический блок инициализатор
    {
        bookId = 0;  // по умолчанию уже 0
        title = "unknown";
        author = "unknown";
        publishingHouse = "unknown";
        yearOfPublication = ValidYearOfPublication.CURRENT_YEAR;
        numberOfPages = ValidNumberOfPages.MIN_NUMBER_OF_PAGES;
        price = ValidPrice.MIN_PRICE;
        binding = "unknown";
    }

    public Book() { }

    public Book(long bookId, String title, String author) {
        setBookId(bookId);
        setTitle(title);
        setAuthor(author);
    }

    public Book(long bookId, String title, String author, String publishingHouse,
                int yearOfPublication, int numberOfPages, double price, String binding)
                throws BadBookException {
        this(bookId, title, author);
        setPublishingHouse(publishingHouse);
        setYearOfPublication(yearOfPublication);
        setNumberOfPages(numberOfPages);
        setPrice(price);
        setBinding(binding);
    }

    // setters
    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setYearOfPublication(int yearOfPublication) throws BadBookException {
        if (ValidYearOfPublication.isValidYearOfPublication(yearOfPublication)) {
            this.yearOfPublication = yearOfPublication;
        }
        else {
            throw new BadBookException("The year of publication is not valid!");
        }
    }

    public void setNumberOfPages(int numberOfPages) throws BadBookException {
        if(ValidNumberOfPages.isValidNumberOfPages(numberOfPages)) {
            this.numberOfPages = numberOfPages;
        }
        else {
            throw new BadBookException("Number of pages is not valid!");
        }
    }

    public void setPrice(double price) throws BadBookException {
        if (ValidPrice.isValidPrice(price)) {
            this.price = price;
        }
        else {
            throw new BadBookException("The price of book is not valid!");
        }
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    //getters
    public long getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public String getBinding() {
        return binding;
    }

    @Override
    public int compareTo(Book ob) {
        return (int)(this.bookId - ob.getBookId());
    }

    @Override
    public Object clone() throws CloneNotSupportedException { // переопределение
        Book copy = null;
        copy = (Book) super.clone(); // вызов базового метода
        return copy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        if (getBookId() != book.getBookId()) return false;
        if (!getTitle().equals(book.getTitle())) return false;
        if (!getAuthor().equals(book.getAuthor())) return false;
        if (!getPublishingHouse().equals(book.getPublishingHouse())) return false;
        if (!getBinding().equals(book.getBinding())) return false;
        if (getYearOfPublication() != book.getYearOfPublication())  return false;
        if (getNumberOfPages() != book.getNumberOfPages()) return false;
        return (Double.compare(book.getPrice(), getPrice()) !=  0);
    }

    @Override
    public int hashCode() {
        int result = (int) (getBookId() ^ (getBookId() >>> 32));
        result = 31 * result + getTitle().hashCode();
        result = 31 * result + getAuthor().hashCode();
        result = 31 * result + getPublishingHouse().hashCode();
        return result;
    }

    @Override
    public String toString() {
        String res ="\nBook {" +
                "\nbookId : " + bookId +
                ", \ntitle : " + title +
                ", \nauthor : " + author ;
        if (publishingHouse != null) {
            res = res +  ", \npublishing house : " + publishingHouse;
        }
        res = res + ", \nyear of publication : " + yearOfPublication +
                ", \nnumber of pages : " + numberOfPages +
                ", \nprice : " + price;
        if (binding != null) {
            res = res + ", \nbinding : " + binding;
        }
        res = res + "\n}";
        return res;
    }
}
