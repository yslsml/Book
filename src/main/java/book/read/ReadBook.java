package book.read;

import book.entity.Book;
import book.exception.BadReadBookException;
import book.exception.BadBookException;

import java.io.InputStream;
import java.util.Scanner;

public class ReadBook {
    public static Book ReadFromConsole(InputStream scan) throws IllegalArgumentException, BadReadBookException, BadBookException {
        Book book = null;

        Scanner scanner = new Scanner(scan);

        long bookId;
        String title;
        String author;
        String publishingHouse;
        int yearOfPublication;
        int numberOfPages;
        double price;
        String binding;

        System.out.println("\nEnter book info: \nEnter a bookId (long): ");

        if (scanner.hasNextLong()) {
            bookId = scanner.nextLong();
        } else {
            throw new BadReadBookException("Entering a bookId Exception!");
        }

        System.out.print("Enter a title: ");
        scanner.nextLine();  // берет на себя "\n" с предыдущего ввода
        title = scanner.nextLine();

        System.out.print("Enter a author: ");
        author = scanner.nextLine();

        System.out.print("Enter a publishing house: ");
        publishingHouse = scanner.nextLine();

        System.out.print("Enter a year of publication (int): ");
        if (scanner.hasNextInt()) {
            yearOfPublication = scanner.nextInt();
        } else {
            throw new BadReadBookException("Entering a year of publication Exception!");
        }

        System.out.print("Enter a number of pages (int): ");
        if (scanner.hasNextInt()) {
            numberOfPages = scanner.nextInt();
        } else {
            throw new BadReadBookException("Entering a number of pages Exception!");
        }

        System.out.print("Enter a price (double): ");  //while
        if (scanner.hasNextDouble()) {
            price = scanner.nextDouble();
        } else {
            throw new BadReadBookException("Entering a price Exception!");
        }

        System.out.print("Enter a binding: ");
        scanner.nextLine();  // берет на себя "\n" с предыдущего ввода
        binding = scanner.nextLine();

        book = new Book(bookId, title, author, publishingHouse, yearOfPublication, numberOfPages, price, binding);
        return book;
    }
}
