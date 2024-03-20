package Question1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AddTwoIntegersTest {

    @Test
    public void testAddPositiveNumbers() {
        assertEquals(12, AddTwoIntegers.add(5, 7));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-2, AddTwoIntegers.add(-5, 3));
    }
}
