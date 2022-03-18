package book.exception;

public class BadReadBookException extends Exception{
    public BadReadBookException() {
        super();
    }

    public BadReadBookException(String message) {
        super(message);
    }

    public BadReadBookException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadReadBookException(Throwable cause) {
        super(cause);
    }

    public BadReadBookException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
