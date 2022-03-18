package book.exception;

public class BadBookException extends Exception {

    public BadBookException() {
        super();
    }

    public BadBookException(String message) {
        super(message);
    }

    public BadBookException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadBookException(Throwable cause) {
        super(cause);
    }

    public BadBookException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
