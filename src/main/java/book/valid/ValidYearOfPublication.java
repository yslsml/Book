package book.valid;
import java.util.Calendar;

public class ValidYearOfPublication {
    static Calendar cal = Calendar.getInstance();
    public static final int CURRENT_YEAR = cal.get(Calendar.YEAR);
    public static final int FIRST_YEAR_OF_PUBLICATION = 1000;

    public static boolean isValidYearOfPublication(int yearOfPublication) {
        return (yearOfPublication >= FIRST_YEAR_OF_PUBLICATION && yearOfPublication <= CURRENT_YEAR);
    }
}
