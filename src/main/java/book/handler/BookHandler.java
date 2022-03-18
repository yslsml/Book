package book.handler;

import book.entity.Book;

import java.util.ArrayList;
import java.util.Arrays;

public class BookHandler {

    public static Book[] chooseAuthor(Book[] array, String author) { // список книг заданного автора

        //Вариант 1. Традиционная работа с массивами перебором элементов
        ArrayList<Book> arrayList = new ArrayList<Book>();
        for (Book book : array) {
            if (book.getAuthor().equals(author)) {
                arrayList.add(book);
            }
        }
        Book res[] = new Book[arrayList.size()];
        res = arrayList.toArray(res);
        return res;
    }

    public static Book[] chooseAuthorByApi(Book[] array, String author) {

        // Вариант 2. Работа со Stream API
        return Arrays.stream(array)  // получаем поток
                .filter(book ->book.getAuthor().equals(author))  // применяем фильтрацию по автору
                .toArray(Book[]::new);  //преобразуем поток в массив, даем ссылку на конструктор массива
    }

    public static Book[] choosePublishingHouse(Book[] array, String publishingHouse) {  // список книг, выпущенных заданным издательством

        //Вариант 1. Традиционная работа с массивами перебором элементов
        ArrayList<Book> arrayList = new ArrayList<Book>();
        for (Book book : array) {
            if (book.getPublishingHouse().equals(publishingHouse)) {
                arrayList.add(book);
            }
        }
        Book res[] = new Book[arrayList.size()];
        res = arrayList.toArray(res);
        return res;
    }

    public static Book[] choosePublishingHouseByApi(Book[] array, String publishingHouse) {

        // Вариант 2. Работа со Stream API
        return Arrays.stream(array)  // получаем поток
                .filter(book ->book.getPublishingHouse().equals(publishingHouse))  // применяем фильтрацию по автору
                .toArray(Book[]::new);  //преобразуем поток в массив, даем ссылку на конструктор массива
    }

    public static Book[] chooseYearOfPublication(Book[] array, int year) {  // список книг, выпущенных после заданного года

        //Вариант 1. Традиционная работа с массивами перебором элементов
        ArrayList<Book> arrayList = new ArrayList<Book>();
        for (Book book : array) {
            if (book.getYearOfPublication() >= year) {
                arrayList.add(book);
            }
        }
        Book res[] = new Book[arrayList.size()];
        res = arrayList.toArray(res);
        return res;
    }

    public static Book[] chooseYearOfPublicationByApi(Book[] array, int year) {

        // Вариант 2. Работа со Stream API
        return Arrays.stream(array)  // получаем поток
                .filter(book -> book.getYearOfPublication() >= year)  // применяем фильтрацию по автору
                .toArray(Book[]::new);  //преобразуем поток в массив, даем ссылку на конструктор массива
    }

}
