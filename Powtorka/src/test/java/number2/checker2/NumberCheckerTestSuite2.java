package number2.checker2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumberCheckerTestSuite2 {

    private final Numberchecker2 nc2 = new Numberchecker2();

    @Test
    public void checkIfFalseWhenNotDividedCorrectly() {

      boolean result =  nc2.checkNumber(13);
        assertFalse(result);
    }
    @Test
    public void checkIfFalseWhenDividedCorrectly() {

        boolean result = nc2.checkNumber(12);
        assertTrue(result);
    }
    @Test
    public void checkIfTrueWhenDividedbyZero() {

        boolean result = nc2.checkNumber(0);
        assertTrue(result);
    }
    @Test
    public void checkIfFalseWhenDividedbyNegative() {

        boolean result = nc2.checkNumber(-12);
        assertFalse(result);
    }
    @Test
    public void checkIfFalseWhenDividedByDouble() {

        boolean result = nc2.checkNumber(120);
        assertTrue(result);
    }
}
