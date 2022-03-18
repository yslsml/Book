package booktests.valid;

import book.valid.ValidYearOfPublication;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidYearOfPublicationTest {

    @Test(description = "positive test validating int year of publication", enabled = true)
    public void testIsValidYearOfPublicationPositive() {
        int year = 2020;
        boolean actual = ValidYearOfPublication.isValidYearOfPublication(year);
        boolean expected = true;
        Assert.assertEquals(actual, expected);
    }

    @Test (description = "negative test validating int year of publication", enabled = true)
    public void testIsValidYearOfPublicationNegative() {
        int year = 10;
        boolean actual = ValidYearOfPublication.isValidYearOfPublication(year);
        boolean expected = true;
        Assert.assertNotEquals(actual, expected);
    }
}
