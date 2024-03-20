package Question3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class FibonacciSeriesTest {

    @Test
    public void testGenerateFibonacci() {
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        assertArrayEquals(expected, FibonacciSeries.generateFibonacci(10));
    }

    @Test
    public void testGenerateFibonacciWithNegativeTerms() {
        assertThrows(IllegalArgumentException.class, () -> FibonacciSeries.generateFibonacci(-5));
    }
}
