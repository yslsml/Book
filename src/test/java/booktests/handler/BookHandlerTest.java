package booktests.handler;

import book.entity.Book;
import book.exception.BadBookException;
import book.handler.BookHandler;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BookHandlerTest {

    @BeforeClass
    public Book[] setUp() throws BadBookException {
        Book[] books = new Book[5];

        books[0] = new Book(1,"War and piece", "Lev Tolstoi", "Misk 2000", 1999, 1014, 56.23, "soft");
        books[1] = new Book(2,"Anna Karenina", "Lev Tolstoi", "Misk 2000", 2002, 989, 48.00, "soft");
        books[2] = new Book(3,"Harry Potter", "J.K. Rowling", "London", 2016, 986, 46.83, "hard");
        books[3] = new Book(4,"Sherlock Holmes", "A.C. Doyle", "London", 1780, 564, 22.99, "hard");
        books[4] = new Book(5,"Skazki", "Korney Chukovski", "Misk 2000", 2006, 320, 15.54, "soft");

        return books;
    }

    @Test (description = "positive test for creating array of Books with chosen author", enabled = true)
    public void testChooseAuthorPositive() throws BadBookException {
        Book[] books = setUp();

        String author = "Lev Tolstoi";
        Book[] actual = BookHandler.chooseAuthor(books, author);
        Book[] expected = {books[0], books[1]};
        Assert.assertEquals(actual, expected);
    }

    @Test (description = "negative test for creating array of Books with chosen author", enabled = true)
    public void testChooseAuthorNegative() throws BadBookException {
        Book[] books = setUp();

        String author = "Lev Tolstoi";
        Book[] actual = BookHandler.chooseAuthor(books, author);
        Book[] expected = {books[0], books[1], books[2]};
        Assert.assertNotEquals(actual, expected);
    }

    @Test (description = "positive test for creating array of Books with chosen author (using stream api)", enabled = true)
    public void testChooseAuthorByApiPositive() throws BadBookException {
        Book[] books = setUp();

        String author = "Lev Tolstoi";
        Book[] actual = BookHandler.chooseAuthorByApi(books, author);
        Book[] expected = {books[0], books[1]};
        Assert.assertEquals(actual, expected);
    }

    @Test (description = "negative test for creating array of Books with chosen author (using stream api)", enabled = true)
    public void testChooseAuthorByApiNegative() throws BadBookException {
        Book[] books = setUp();

        String author = "Lev Tolstoi";
        Book[] actual = BookHandler.chooseAuthorByApi(books, author);
        Book[] expected = {books[2]};
        Assert.assertNotEquals(actual, expected);
    }

    @Test (description = "positive test for creating array of Books with chosen publishing house", enabled = true)
    public void testChoosePublishingHousePositive() throws BadBookException {
        Book[] books = setUp();

        String publHouse = "London";
        Book[] actual = BookHandler.choosePublishingHouse(books, publHouse);
        Book[] expected = {books[2], books[3]};
        Assert.assertEquals(actual, expected);
    }

    @Test (description = "negative test for creating array of Books with chosen publishing house", enabled = true)
    public void testChoosePublishingHouseNegative() throws BadBookException {
        Book[] books = setUp();

        String publHouse = "London";
        Book[] actual = BookHandler.choosePublishingHouse(books, publHouse);
        Book[] expected = {books[1], books[3]};
        Assert.assertNotEquals(actual, expected);
    }

    @Test (description = "positive test for creating array of Books with chosen publishing house (using stream api)", enabled = true)
    public void testChoosePublishingHouseByApiPositive() throws BadBookException {
        Book[] books = setUp();

        String publHouse = "London";
        Book[] actual = BookHandler.choosePublishingHouseByApi(books, publHouse);
        Book[] expected = {books[2], books[3]};
        Assert.assertEquals(actual, expected);
    }

    @Test (description = "negative test for creating array of Books with chosen publishing house (using stream api)", enabled = true)
    public void testChoosePublishingHouseByApiNegative() throws BadBookException {
        Book[] books = setUp();

        String publHouse = "London";
        Book[] actual = BookHandler.choosePublishingHouseByApi(books, publHouse);
        Book[] expected = {books[1], books[3]};
        Assert.assertNotEquals(actual, expected);
    }

    @Test (description = "positive test for creating array of Books with chosen year of publication", enabled = true)
    public void testChooseYearOfPublicationPositive() throws BadBookException {
        Book[] books = setUp();

        int year = 2000;
        Book[] actual = BookHandler.chooseYearOfPublication(books, year);
        Book[] expected = {books[1], books[2], books[4]};
        Assert.assertEquals(actual, expected);
    }

    @Test (description = "negative test for creating array of Books with chosen year of publication", enabled = true)
    public void testChooseYearOfPublicationNegative() throws BadBookException {
        Book[] books = setUp();

        int year = 2000;
        Book[] actual = BookHandler.chooseYearOfPublication(books, year);
        Book[] expected = {books[0], books[2], books[4]};
        Assert.assertNotEquals(actual, expected);
    }

    @Test (description = "positive test for creating array of Books with chosen year of publication (using stream api)", enabled = true)
    public void testChooseYearOfPublicationByApiPositive() throws BadBookException {
        Book[] books = setUp();

        int year = 2000;
        Book[] actual = BookHandler.chooseYearOfPublicationByApi(books, year);
        Book[] expected = {books[1], books[2], books[4]};
        Assert.assertEquals(actual, expected);
    }

    @Test (description = "negative test for creating array of Books with chosen year of publication (using stream api)", enabled = true)
    public void testChooseYearOfPublicationByApiNegative() throws BadBookException {
        Book[] books = setUp();

        int year = 2000;
        Book[] actual = BookHandler.chooseYearOfPublicationByApi(books, year);
        Book[] expected = {books[0], books[2], books[4]};
        Assert.assertNotEquals(actual, expected);
    }

}
