package Question4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CountDigitsTest {

    @Test
    public void testCountDigitsPositive() {
        assertEquals(4, CountDigits.countDigits(1234));
    }

    @Test
    public void testCountDigitsZero() {
        assertEquals(1, CountDigits.countDigits(0));
    }
}
