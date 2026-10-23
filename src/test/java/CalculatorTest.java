import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void sumOfTwoPositives() {
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    void sumWithNegatives() {
        assertEquals(-5, calculator.sum(-2, -3));
        assertEquals(1, calculator.sum(-2, 3));
    }

    @Test
    void sumWithZero() {
        assertEquals(7, calculator.sum(7, 0));
        assertEquals(0, calculator.sum(0, 0));
    }
}