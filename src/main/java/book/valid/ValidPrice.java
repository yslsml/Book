package book.valid;

public class ValidPrice {
    public static final double MIN_PRICE = 0.01;

    public static boolean isValidPrice(double price) {
        return (price >= MIN_PRICE);
    }
}
