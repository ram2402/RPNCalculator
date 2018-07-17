import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RPNCalculatorTest {
    @Test
    public void calculateShouldReturn5When2And3WithPlusIsPassed() {
        assertEquals(5, RPNCalculator.calculate("2 3 +"));
    }

    @Test
    public void calculateShouldReturn10When7And3WithPlusIsPassed() {
        assertEquals(10, RPNCalculator.calculate("7 3 +"));
    }

    @Test
    public void calculateShouldReturn5When12And2WithMinusIsPassed() {
        assertEquals(10, RPNCalculator.calculate("12 2 -"));
    }

    @Test
    public void calculateShouldReturn21When7And3WithMultiplicationIsPassed() {
        assertEquals(21, RPNCalculator.calculate("7 3 *"));
    }

    @Test
    public void calculateShouldReturnQuotientWhenDiviorIspAssed() {
        assertEquals(2, RPNCalculator.calculate("10 5 /"));
    }

    @Test
    public void calculateShouldReturn49When7And7WithPowIsPassed() {
        assertEquals(49, RPNCalculator.calculate("7 2 ^"));
    }

    @Test
    public void calculateShouldReturn15When4And6WithPlus5PlusIspassed() {
        assertEquals(15, RPNCalculator.calculate("4 6 + 5 +"));
    }


    @Test
    public void calculateShouldReturnValidAnswerWhenMultipleOperationsPerformed() {
        assertEquals(10, RPNCalculator.calculate("4 6 + 5 + 3 / 2 *"));
    }


}
