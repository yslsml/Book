package book.valid;

public class ValidNumberOfPages {
    public static final int MIN_NUMBER_OF_PAGES = 1;

    public static boolean isValidNumberOfPages(int numberOfPages) {
        return (numberOfPages >= MIN_NUMBER_OF_PAGES);
    }
}
