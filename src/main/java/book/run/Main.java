package book.run;

import book.entity.Book;
import book.exception.BadBookException;
import book.exception.BadReadBookException;
import book.handler.BookHandler;
import book.read.ReadBook;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Создать массив объектов. Вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

public class Main {

    static Logger logger = LogManager.getLogger();
    public static final int size = 5;

    public static void main(String[] args) {
        try {
            Book[] books = new Book[size];

            /*for (int i = 0; i < size; i++) {
                books[i] = ReadBook.ReadFromConsole(System.in);
            }*/

            books[0] = new Book(1,"War and piece", "Lev Tolstoi", "Misk 2000", 1999, 1014, 56.23, "soft");
            books[1] = new Book(2,"Anna Karenina", "Lev Tolstoi", "Misk 2000", 2002, 989, 48.00, "soft");
            books[2] = new Book(3,"Harry Potter", "J.K. Rowling", "London", 2016, 986, 46.83, "hard");
            books[3] = new Book(4,"Sherlock Holmes", "A.C. Doyle", "London", 1780, 564, 22.99, "hard");
            books[4] = new Book(5,"Skazki", "Korney Chukovski", "Misk 2000", 2006, 320, 15.54, "soft");

            logger.log(Level.INFO, "Array of books:");
            for (int j = 0; j < size; j++) {
                logger.log(Level.INFO, books[j]);
            }

            String author = "Lev Tolstoi";
            Book[] booksOfAuthor = BookHandler.chooseAuthor(books, author);
            //System.out.printf("\nArray of books which author is %s :\n", author);
            logger.log(Level.INFO, "Array of books which author is " + author);
            for (int j = 0; j < booksOfAuthor.length; j++) {
                logger.log(Level.INFO, booksOfAuthor[j]);
            }

            String publishingHouse = "London";
            Book[] booksOfPublishingHouse = BookHandler.choosePublishingHouse(books, publishingHouse);
            //System.out.printf("\nArray of books of publishing house %s :\n", publishingHouse);
            logger.log(Level.INFO, "Array of books of publishing house " + publishingHouse);
            for (int j = 0; j < booksOfPublishingHouse.length; j++) {
                logger.log(Level.INFO, booksOfPublishingHouse[j]);
            }

            int year = 2000;
            Book[] booksAfterYear = BookHandler.chooseYearOfPublication(books, year);
            //System.out.printf("\nArray of books which were published after %d :\n", year);
            logger.log(Level.INFO, "Array of books which were published after " + year);
            for (int j = 0; j < booksAfterYear.length; j++) {
                logger.log(Level.INFO, booksAfterYear[j]);
            }

        }
       catch (BadBookException e) {
            logger.log(Level.ERROR, "Bad values of book exception!!!");
        } /*catch (BadReadBookException e) {
            logger.log(Level.ERROR, "Bad read book exception!!!");
        }*/

        }
    }

