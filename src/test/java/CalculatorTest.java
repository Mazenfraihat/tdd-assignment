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

    @Test
    void subtractPositiveResult() {
        assertEquals(6, calculator.subtract(10, 4));
    }

    @Test
    void subtractNegativeResult() {
        assertEquals(-6, calculator.subtract(4, 10));
    }

    @Test
    void subtractNegativeOperand() {
        assertEquals(8, calculator.subtract(5, -3));
    }

    @Test
    void multiplyPositives() {
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    void multiplyByZero() {
        assertEquals(0, calculator.multiply(9, 0));
    }

    @Test
    void multiplyNegatives() {
        assertEquals(-12, calculator.multiply(-3, 4));
        assertEquals(12, calculator.multiply(-3, -4));
    }

    @Test
    void divideExact() {
        assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    void divideTruncates() {
        assertEquals(3, calculator.divide(7, 2));
        assertEquals(-3, calculator.divide(-7, 2));
    }

    @Test
    void divideZeroNumerator() {
        assertEquals(0, calculator.divide(0, 5));
    }
}