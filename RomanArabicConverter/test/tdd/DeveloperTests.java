package tdd;

import org.junit.Test;

/**
 * Developer test cases for the RomanArabicConverter class.
 *
 * @author pgchambers
 * @version Dec 11, 2014
 */
public class DeveloperTests {

    @Test(expected = MalformedNumberException.class)
    public void inputLowCase() throws Exception {
        new RomanArabicConverter("iii");
    }

    @Test(expected = ValueOutOfBoundsException.class)
    public void lowInputTest() throws Exception {
        new RomanArabicConverter("0").toRoman();
    }

    @Test(expected = ValueOutOfBoundsException.class)
    public void highInputTest() throws Exception {
        new RomanArabicConverter("4000").toRoman();
    }
}
