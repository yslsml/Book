package booktests.valid;

import book.valid.ValidPrice;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidPriceTest {

    @Test(description = "positive test validating double price", enabled = true)
    public void testIsValidPricePositive() {
        double price = 12.54;
        boolean actual = ValidPrice.isValidPrice(price);
        boolean expected = true;
        Assert.assertEquals(actual, expected);
    }

    @Test (description = "negative test validating double price", enabled = true)
    public void testIsValidPriceNegative() {
        double price = 0;
        boolean actual = ValidPrice.isValidPrice(price);
        boolean expected = true;
        Assert.assertNotEquals(actual, expected);
    }
}
