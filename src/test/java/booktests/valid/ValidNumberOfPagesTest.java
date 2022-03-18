package booktests.valid;

import book.valid.ValidNumberOfPages;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidNumberOfPagesTest {

    @Test (description = "positive test validating int number of pages", enabled = true)
    public void testIsValidNumberOfPagesPositive() {
        int number = 23;
        boolean actual = ValidNumberOfPages.isValidNumberOfPages(number);
        boolean expected = true;
        Assert.assertEquals(actual, expected);
    }

    @Test (description = "negative test validating int number of pages", enabled = true)
    public void testIsValidNumberOfPagesNegative() {
        int number = -23;
        boolean actual = ValidNumberOfPages.isValidNumberOfPages(number);
        boolean expected = true;
        Assert.assertNotEquals(actual, expected);
    }
}
